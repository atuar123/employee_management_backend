package com.myself.employee_management_backend.controller;

import com.myself.employee_management_backend.entity.Employee;
import com.myself.employee_management_backend.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@CrossOrigin(origins = "*", methods =
        {GET, POST, PUT, DELETE, OPTIONS})
@RestController
@RequestMapping(value = "/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> employeeList(){
        return employeeService.getAll();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee ){
        return employeeService.update(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return employeeService.delete(id);
    }
}

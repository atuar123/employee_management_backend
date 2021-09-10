package com.myself.employee_management_backend.controller;

import com.myself.employee_management_backend.entity.Employee;
import com.myself.employee_management_backend.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<Employee> employeeList(){
        return employeeService.getAll();
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}

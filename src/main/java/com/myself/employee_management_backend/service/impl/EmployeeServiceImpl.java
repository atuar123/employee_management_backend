package com.myself.employee_management_backend.service.impl;

import com.myself.employee_management_backend.entity.Employee;
import com.myself.employee_management_backend.repository.EmployeeRepository;
import com.myself.employee_management_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getById(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee;
    }

    @Override
    public String delete(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return "Deleted Successfully";
    }
}

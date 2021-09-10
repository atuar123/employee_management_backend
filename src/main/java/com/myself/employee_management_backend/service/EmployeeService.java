package com.myself.employee_management_backend.service;

import com.myself.employee_management_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee getById(Long id);
    String delete(Long id);

}

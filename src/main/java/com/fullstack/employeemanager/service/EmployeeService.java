package com.fullstack.employeemanager.service;

import com.fullstack.employeemanager.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void updateEmployee(long id);

    Employee findById(long id);

    void deleteEmployee(long id);
}

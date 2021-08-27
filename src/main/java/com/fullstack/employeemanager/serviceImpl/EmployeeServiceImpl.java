package com.fullstack.employeemanager.serviceImpl;

import com.fullstack.employeemanager.Exception.UserNotFoundException;
import com.fullstack.employeemanager.model.Employee;
import com.fullstack.employeemanager.repo.EmployeeRepo;
import com.fullstack.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.saveAndFlush(employee);

    }

    @Override
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee){
        return employeeRepo.saveAndFlush(employee);
    }

    @Override
    public void updateEmployee(long id){
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee findById(long id){
        return employeeRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User id "+id+" not found"));
    }

    @Override
    public void deleteEmployee( long id){
         employeeRepo.deleteById(id);
    }
}

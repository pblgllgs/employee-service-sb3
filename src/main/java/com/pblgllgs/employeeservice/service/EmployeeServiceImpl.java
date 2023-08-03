package com.pblgllgs.employeeservice.service;

import com.pblgllgs.employeeservice.model.Employee;
import com.pblgllgs.employeeservice.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



}

package com.pblgllgs.employeeservice.controller;

import com.pblgllgs.employeeservice.model.Employee;
import com.pblgllgs.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> findAll() {
        LOGGER.info("Employees {}", (long) employeeRepository.findAll().size());
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        LOGGER.info("Employee added:");
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Employee findEmployeeById(@PathVariable("employeeId") Long id) {
        LOGGER.info("Employee find:");
        return employeeRepository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long id) {
        LOGGER.info("Employees with department id:{}",id);
        return employeeRepository.findByDepartment(id);
    }
}

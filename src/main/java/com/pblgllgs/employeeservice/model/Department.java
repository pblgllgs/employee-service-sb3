package com.pblgllgs.employeeservice.model;

import java.util.List;

public record Department(
        Long id,
        String name,
        List<Employee> employees
) {}

package com.demo.cruddemodbapi.service;

import com.demo.cruddemodbapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}

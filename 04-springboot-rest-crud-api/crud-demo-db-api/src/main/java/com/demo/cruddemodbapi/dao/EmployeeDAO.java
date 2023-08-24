package com.demo.cruddemodbapi.dao;

import com.demo.cruddemodbapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}

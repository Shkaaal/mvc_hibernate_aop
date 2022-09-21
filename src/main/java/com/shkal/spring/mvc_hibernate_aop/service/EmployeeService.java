package com.shkal.spring.mvc_hibernate_aop.service;

import com.shkal.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> showAllEmployees();

    public void saveNewEmployee(Employee employee);

    public Employee getEmployee (int id);

    public void deleteEmployee(int id);
}

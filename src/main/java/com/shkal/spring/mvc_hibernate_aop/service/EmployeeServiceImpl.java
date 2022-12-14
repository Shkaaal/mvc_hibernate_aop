package com.shkal.spring.mvc_hibernate_aop.service;

import com.shkal.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.shkal.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> showAllEmployees() {
        return employeeDAO.showAllEmployees();
    }

    @Override
    @Transactional
    public void saveNewEmployee(Employee employee) {
        employeeDAO.saveNewEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}

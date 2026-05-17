package com.cheptanui.springbootdemo2.service;

import com.cheptanui.springbootdemo2.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String Id);
    String deleteEmployeeById(String id);
}

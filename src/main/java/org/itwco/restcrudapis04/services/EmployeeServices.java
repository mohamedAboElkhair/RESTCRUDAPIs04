package org.itwco.restcrudapis04.services;

import org.itwco.restcrudapis04.entity.Employee;

import java.util.List;

public interface EmployeeServices {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void delete(int theId);
}

package org.itwco.restcrudapis04.services;

import org.itwco.restcrudapis04.entity.Employee;

import java.util.List;

public interface EmployeeServices {

    List<Employee> findAll();
}

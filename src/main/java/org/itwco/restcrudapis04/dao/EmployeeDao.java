package org.itwco.restcrudapis04.dao;

import org.itwco.restcrudapis04.entity.Employee;

import java.util.List;

public interface EmployeeDao {
   List<Employee> findAll();
   Employee findById(int id);
   Employee save(Employee employee);
   void delete(int theId);
}

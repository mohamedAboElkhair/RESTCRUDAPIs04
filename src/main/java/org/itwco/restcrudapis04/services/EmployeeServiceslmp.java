package org.itwco.restcrudapis04.services;

import org.itwco.restcrudapis04.dao.EmployeeDao;
import org.itwco.restcrudapis04.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceslmp implements EmployeeServices {
    private EmployeeDao employeeDao;
    //inject
    @Autowired
    public EmployeeServiceslmp(EmployeeDao theEmployeeDao) {
        this.employeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = employeeDao.findById(id);

        return employee;
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee savedEmployee = employeeDao.save(employee);
        return savedEmployee;
    }
    @Transactional
    @Override
    public void delete(int theId) {
    employeeDao.delete(theId);
    }
}

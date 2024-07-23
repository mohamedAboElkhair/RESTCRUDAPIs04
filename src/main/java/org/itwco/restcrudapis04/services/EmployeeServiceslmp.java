package org.itwco.restcrudapis04.services;

import org.itwco.restcrudapis04.dao.EmployeeDao;
import org.itwco.restcrudapis04.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

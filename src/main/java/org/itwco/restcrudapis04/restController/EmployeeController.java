package org.itwco.restcrudapis04.restController;

import org.itwco.restcrudapis04.dao.EmployeeDao;
import org.itwco.restcrudapis04.entity.Employee;
import org.itwco.restcrudapis04.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices theEmployeeServices) {
        this.employeeServices = theEmployeeServices;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
       return employeeServices.findAll();
    };
}

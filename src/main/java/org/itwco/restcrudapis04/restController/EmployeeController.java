package org.itwco.restcrudapis04.restController;

import org.itwco.restcrudapis04.dao.EmployeeDao;
import org.itwco.restcrudapis04.entity.Employee;
import org.itwco.restcrudapis04.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/employees/{employeId}")
    public Employee getEmployeeById(@PathVariable int employeId) {
        Employee theEmploye = employeeServices.findById(employeId);
        if (theEmploye == null) {
            throw new RuntimeException("Employee not found" + employeId);
        }
        return theEmploye;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);
       Employee employee =employeeServices.save(theEmployee);
        return employee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee employee =employeeServices.save(theEmployee);
        return employee;
    }
    @DeleteMapping("/employees/{employeId}")
    public String deleteEmployee(@PathVariable int employeId) {
        Employee employee = employeeServices.findById(employeId);
        if (employee == null) {
            throw new RuntimeException("Employee not found " + employeId);
        }
        employeeServices.delete(employeId);
        return "Employee deleted "+employeId;
    }
}

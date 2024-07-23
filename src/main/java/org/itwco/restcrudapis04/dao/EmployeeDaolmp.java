package org.itwco.restcrudapis04.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.itwco.restcrudapis04.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaolmp implements EmployeeDao {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDaolmp(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
}

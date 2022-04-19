package com.demo.example.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.example.entity.Course;
import com.demo.example.entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
	EntityManager em;
    
    //insert an employee
    public void insert(Employee employee) {
    	em.persist(employee); 	
    }
    
    //retrieve all employee
    
	public List<Employee>retrieveAllEmployees() {
		return em.createQuery("select e from Employee e",Employee.class).getResultList();	
	}

}

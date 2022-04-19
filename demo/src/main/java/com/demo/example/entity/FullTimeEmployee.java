package com.demo.example.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="avinash_full_time_employee")
public class FullTimeEmployee extends Employee {
	private BigDecimal salary;
	
	protected FullTimeEmployee() {
		
	}
	
	public FullTimeEmployee(String name, BigDecimal salary) {
		super(name);
		this.salary = salary;
		
	}

}

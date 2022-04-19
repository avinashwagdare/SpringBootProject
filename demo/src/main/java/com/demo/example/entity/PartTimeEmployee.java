package com.demo.example.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="avinash_part_time_employee")
public class PartTimeEmployee extends Employee {
	
	private BigDecimal hourlyWage;
	
	protected PartTimeEmployee() {
		
	}
	
	public PartTimeEmployee(String name, BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
		
	}

}

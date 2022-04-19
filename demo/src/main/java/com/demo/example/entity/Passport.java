package com.demo.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="avinash_passport")
@Entity
public class Passport {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String number;
	
//	@UpdateTimestamp
//	private LocalDateTime lastUpdatedTime;
//	
//	@CreationTimestamp
//	private LocalDateTime createdDate;
	
    @OneToOne(fetch=FetchType.LAZY, mappedBy="passport")
    private Student student;

	protected Passport() {
	}

	public Passport(String number) {
		
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Passport[%s]", number);
	}

}

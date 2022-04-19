package com.demo.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "avinash_student")
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToOne(fetch=FetchType.LAZY)
	private Passport passport;

	@ManyToMany  //(fetch=FetchType.EAGER)
	@JoinTable(name ="avinash_student_courses", 
	joinColumns = @JoinColumn(name="student_id"), 
	inverseJoinColumns = @JoinColumn(name="courses_id"))
	private List<Course> courses = new ArrayList<>();
	
	
//	@UpdateTimestamp
//	private LocalDateTime lastUpdatedTime;
//	
//	@CreationTimestamp
//	private LocalDateTime createdDate;

	protected Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourses(Course courses) {
		this.courses.add(courses);
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Student[%s]", name);
	}

}

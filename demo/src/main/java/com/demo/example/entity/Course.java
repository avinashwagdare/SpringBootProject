package com.demo.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Table(name="avinash_course")
@Entity
@Table(name="avinash_course")
public class Course {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "course")
	private List<Review> review = new ArrayList<>();
	
	@ManyToMany(mappedBy = "courses")
	private List<Student> student = new ArrayList<>();
 	
	/*
	 * @UpdateTimestamp private LocalDateTime lastUpdatedTime;
	 * 
	 * @CreationTimestamp private LocalDateTime createdDate;
	 */

	protected Course() {
	}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Review> getReview() {
		return review;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}
	
	public void removeReview(Review review) {
		this.review.remove(review);
	}

	public List<Student> getStudent() {
		return student;
	}

	public void addStudent(Student student) {
		this.student.add(student);
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Course[%s]", name);
	}

}

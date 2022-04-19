package com.demo.example.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.example.entity.Course;
import com.demo.example.entity.Passport;
import com.demo.example.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	public Student findById(Long id) {
		return em.find(Student.class,id);
	}
	
	
	  public Student save(Student student) {
	   if(student.getId()==null)
	  {
	  em.persist(student);
	  }
	  else 
	  { 
		  em.merge(student); 
	  } 
	  return student; 
     }
	 
	
//	public void deleteById(Long id) {
//		Student student = findById(id);
//		em.remove(student);
//	}
	
	//public void playWithEntityManager() {
		//logger.info("playWithEntityManager-start");
		
		//Student student1= new Student("Reacts service in 100 steps");
		//em.persist(student1);
		//Student student2= new Student("Node js in 100 steps");
		//em.persist(student2);
		
		//em.flush();
		//em.clear();
		
		//em.detach(student1);
		//em.detach(student2);
		
//		student1.setName("Reacts services in 100 steps-updated");
//		student2.setName("Node js in 100 steps-updated");
//		em.flush();
//		
//		em.refresh(student1);
//	}

	
	public void saveStudentWithPassport() {
		Student student= new Student("sachin");
		Passport passport = new Passport("TS1005");
		student.setPassport(passport);
		em.persist(student);
		em.persist(passport);
		
//		Student student2= new Student("Node js in 100 steps");
//		em.persist(student2);
		
	}
	
	public void insertHardcodedStudentAndCourse() {
		Student student = new Student("Hari");
		Course course = new Course("Microservices");
		em.persist(student);
		em.persist(course);
		
		student.addCourses(course);
		course.addStudent(student);
		em.persist(student);
	}
	
	
}

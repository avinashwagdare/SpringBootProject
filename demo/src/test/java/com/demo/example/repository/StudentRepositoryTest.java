package com.demo.example.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.example.DemoApplication;
import com.demo.example.entity.Passport;
import com.demo.example.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class StudentRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	EntityManager em;
	
	
	@Test
	public void retrieveStudentAndPassportDetails() {
		Student student = em.find(Student.class,22L);
		logger.info("student ->{}",student);
		logger.info("passport ->{}",student.getPassport());
	}
	
	
	@Test
	public void retrievePassportAndAssociatedStudent() {
		Passport passport = em.find(Passport.class,23L);
		logger.info("passport ->{}",passport);
		logger.info("student ->{}",passport.getStudent());
	}
		 
	@Test
	public void retrieveStudentAndCourse() {
		Student student = em.find(Student.class,32L);
		logger.info("student ->{}",student);
		logger.info("course ->{}",student.getCourses());
	}
	
	
	
	/*@Tes
	 * @Test public void findById_basic() { Student student
	 * =repository.findById(1005l);
	 * assertEquals("JPA in 50 Steps-updated",student.getName());
	 * System.out.println("Testing is Running"); }
	 * 
	 * @Test
	 * 
	 * @DirtiesContext public void deleteById_basic() {
	 * //repository.deleteById(1005l); assertNull(repository.findById(1005l));
	 * //assertEquals("python",student.getName());
	 * //System.out.println("Testing is Running"); }
	 */
    
	/*
	 * @Test
	 * 
	 * @DirtiesContext public void save_basic() { //get a student Student student
	 * =repository.findById(1005l);
	 * assertEquals("JPA in 50 Steps-updated",student.getName());
	 * 
	 * //update details student.setName("JPA in 50 Steps-updated");
	 * repository.save(student);
	 * 
	 * 
	 * //check the value Student student1 =repository.findById(1005l);
	 * assertEquals("JPA in 50 Steps-updated",student1.getName());
	 * 
	 * }
	 */
    
	/*
	 * @Test
	 * 
	 * @DirtiesContext public void playWithEntityManager() { repository.
	 * playWithEntityManager();
	 * 
	 * }
	 */
    
    

}

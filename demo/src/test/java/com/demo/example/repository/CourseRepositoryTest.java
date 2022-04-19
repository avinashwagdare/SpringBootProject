package com.demo.example.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.example.DemoApplication;
import com.demo.example.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class CourseRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
    @Test
	public void findById_basic() {
    	Course course =repository.findById(1005l);
    	assertEquals("JPA in 50 Steps-updated",course.getName());
    	System.out.println("Testing is Running");
	}
    
    @Test
    @DirtiesContext
	public void deleteById_basic() {
    	//repository.deleteById(1005l);
    	assertNull(repository.findById(1005l));
    	//assertEquals("python",course.getName());
    	//System.out.println("Testing is Running");
	}
    
	/*
	 * @Test
	 * 
	 * @DirtiesContext public void save_basic() { //get a course Course course
	 * =repository.findById(1005l);
	 * assertEquals("JPA in 50 Steps-updated",course.getName());
	 * 
	 * //update details course.setName("JPA in 50 Steps-updated");
	 * repository.save(course);
	 * 
	 * 
	 * //check the value Course course1 =repository.findById(1005l);
	 * assertEquals("JPA in 50 Steps-updated",course1.getName());
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

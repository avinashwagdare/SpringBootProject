package com.demo.example.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.example.entity.Course;
import com.demo.example.entity.Review;

@Repository
@Transactional
public class CourseRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
	EntityManager em;
	
	public Course findById(Long id) {
		return em.find(Course.class,id);
	}

	public void addHardcodedReviewsForCourse() {
		//get the course 375
		Course course = findById(1006L);
		logger.info("course.getReview() -> {}",course.getReview());
		
		//add 2 review to it
		Review review1 = new Review("5","BestCourse");
		Review review2 = new Review("4","wonderfulCourse");
		
		course.addReview(review1);
		review1.setCourse(course);
		
		course.addReview(review2);
		review2.setCourse(course);
		
		
		//save it to the database
		em.persist(review1);
		em.persist(review2);
		
	}
	
	public void addReviewsForCourse(Long courseId, List<Review> reviews)
	{
		//get the course 375
		Course course = findById(courseId);
		logger.info("course.getReview() -> {}",course.getReview());
		
		    for(Review review:reviews)
			{
				//add 2 review to it
				//Review review1 = new Review("5","BestCourse");
				//Review review2 = new Review("4","wonderfulCourse");
				
				course.addReview(review);
				review.setCourse(course);
				
				/*
				 * course.addReview(review2); review2.setCourse(course);
				 */
				
				
				//save it to the database
				em.persist(review);
				//em.persist(review2);
			
			}
			
	}
	
	
	/*
	 * public Course save(Course course) { if(course.getId()==null) {
	 * em.persist(course); } else { em.merge(course); } return course; }
	 */
	
	
	/*
	 * public void deleteById(Long id) { Course course = findById(id);
	 * em.remove(course); }
	 */
	
	
	/*
	 * public void playWithEntityManager() {
	 * //logger.info("playWithEntityManager-start");
	 * 
	 * Course course1= new Course("Reacts service in 100 steps");
	 * em.persist(course1); Course course2= new Course("Node js in 100 steps");
	 * em.persist(course2);
	 * 
	 * //em.flush(); //em.clear();
	 * 
	 * //em.detach(course1); //em.detach(course2);
	 * 
	 * course1.setName("Reacts services in 100 steps-updated");
	 * course2.setName("Node js in 100 steps-updated"); em.flush();
	 * 
	 * em.refresh(course1); }
	 */
}

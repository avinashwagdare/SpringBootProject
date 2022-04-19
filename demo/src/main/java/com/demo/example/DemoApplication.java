package com.demo.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.example.entity.FullTimeEmployee;
import com.demo.example.entity.PartTimeEmployee;
import com.demo.example.entity.Review;
import com.demo.example.repository.CourseRepository;
import com.demo.example.repository.EmployeeRepository;
import com.demo.example.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//studentRepository.saveStudentWithPassport();
		
		//Course course =repository.findById(1009l);
		//repository.playWithEntityManager();
		//repository.findById(1004l);
		//repository.save(new Course("Microservice in 200 Steps"));
		//repository.deleteById(1003l);
		//logger.info("Course 1000 ->{}",course);
		//System.out.println("Course 1000 ->{}",course);
		//logger.info("inserted records");
		//studentRepository.saveStudentWithPassport();
		//courseRepository.addHardcodedReviewsForCourse();
		
		/*
		 * List<Review> reviews=new ArrayList<>(); reviews.add(new Review("5","Best"));
		 * reviews.add(new Review("5","BeautifulCourse"));
		 * courseRepository.addReviewsForCourse(1008L, reviews);
		 */
		
		//studentRepository.insertHardcodedStudentAndCourse();
		
		employeeRepository.insert(new PartTimeEmployee("attt", new BigDecimal("75")));
		employeeRepository.insert(new FullTimeEmployee("lll", new BigDecimal("9000")));
		
		logger.info("All Employees -> {}",employeeRepository.retrieveAllEmployees());
		
		
	}

}

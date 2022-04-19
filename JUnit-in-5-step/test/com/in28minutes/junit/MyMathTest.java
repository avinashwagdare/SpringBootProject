package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath(); 
	//MyMath.sum(new int[]{1,2,3});   //calling "sum" method and creating int "arry"
	//1,2,3=>6
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public  static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public  static void afterClass() {
		System.out.println("afterClass");
	}

	@Test
	public  void sum_with3numbers() {
		System.out.println("test1");
		//MyMath myMath = new MyMath();
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}

	@Test
	public void sum_with1numbers() {
		//MyMath myMath = new MyMath(); 
		//check that the result is 6
		
		//check result==6
		System.out.println("test2");
		assertEquals(3,myMath.sum(new int[] {3}));
		//System.out.println(result);
	}
	
}

package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condn = true;
		assertEquals(true,condn);
		assertTrue(condn);
	}

}

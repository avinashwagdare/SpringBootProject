package com.in28minutes.springboot.basic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksController {
	@GetMapping("/books")
	public List<books> getAllbooks()
	{
		return Arrays.asList(new books(10,"spring1.1","Ranga"));
	}
	

}

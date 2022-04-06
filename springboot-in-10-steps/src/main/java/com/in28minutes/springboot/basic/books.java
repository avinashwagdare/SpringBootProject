package com.in28minutes.springboot.basic;

public class books {
	long id;
	String name;
	String auther;
	
	public books(){
		
	}
	public books(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuther() {
		return auther;
	}

}

package models;

import java.util.*;

public class Topic {
	private Long id;
	private String name;
	private List <Test> tests;
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}	
	public List <Test> getAllTests() {
		return tests;
	}
	public void setAllTests(List <Test> tests) {
		this.tests = tests;
	}
	
}

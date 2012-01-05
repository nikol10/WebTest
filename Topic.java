package models;

import java.util.*;

public class Topic {
	private Long id;
	private String name;
	private List <Test> tests;
	
	public Long GetId() {
		return id;
	}	
	public void SetId(Long id) {
		this.id = id;
	}
	
	public String GetName() {
		return name;
	}	
	public void SetName(String name) {
		this.name = name;
	}
	
	public List <Test> GetAllTests() {
		return tests;
	}
	public void SetAllTests(List <Test> tests) {
		this.tests = tests;
	}
	
}

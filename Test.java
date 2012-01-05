package models;

import java.util.*;

public class Test {
	private Long id;
	private String name;
	private String description;	
	private List <Question> questions;
	
	
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
	
	public String GetDescription() {
		return description;
	}
	public void SetDescription(String description) {
		this.description = description;
	}
	
	public List <Question> GetAllQuestions() {
		return questions;
	}
	public void SetQuestions(ArrayList <Question> questions) {
		this.questions = questions;
	}
}

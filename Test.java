package models;

import java.util.*;

public class Test {
	private Long id;
	private String name;
	private String description;	
	private List <Question> questions;
	private Topic topic;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public List <Question> getAllQuestions() {
		return questions;
	}
	public void setQuestions(List <Question> questions) {
		this.questions = questions;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}

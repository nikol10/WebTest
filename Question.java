package models;

import java.util.*;

public class Question {
	private Long id;
	private String question;
	private List <Answer> answers;
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}	
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion() {
		return question;
	}
	public List <Answer> getAllAnswers() {
		return answers;
	}
	public void setAnswers(List <Answer> answers) {
		this.answers = answers;
	}
}

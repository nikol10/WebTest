package models;

import java.util.*;

public class Question {
	private Long id;
	private String text;
	private List <Answer> answers;
	private Answer correctAnswer;
	private Test test;
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}	
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public List <Answer> getAllAnswers() {
		return answers;
	}
	public void setAnswers(List <Answer> answers) {
		this.answers = answers;
	}
	public Answer getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
}

package models;

import java.util.*;

public class Question {
	private Long id;
	private String quest;
	private List <Answer> answers;
	
	public Long GetId() {
		return id;
	}	
	public void SetId(Long id) {
		this.id = id;
	}
	
	@OneToMany
	public List <Answer> GetAllAnswers() {
		return answers;
	}
	public void SetAnswers(List <Answer> answers) {
		this.answers = answers;
	}
}

package models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Question {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "text")
	private String text;
	@OneToMany
	@JoinColumn(name = "questionId")
	private List <Answer> answers;
	@OneToOne
	private Answer correctAnswer;
	@ManyToOne
	@JoinColumn(name = "test")
	private Test test;
	
	public Question() {		
	}
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

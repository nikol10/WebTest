package models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Test")
public class Test {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;	
	@OneToMany
	@JoinColumn(name = "testId")
	private List <Question> questions;
	@ManyToOne
	@JoinColumn(name = "topic")
	private Topic topic;
	
	public Test() {		
	}
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

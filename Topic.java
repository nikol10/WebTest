package models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Topic")
public class Topic {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	private String name;
	@OneToMany
	@JoinColumn(name = "testId")
	private List <Test> tests;
	
	public Topic() {		
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
	public List <Test> getAllTests() {
		return tests;
	}
	public void setAllTests(List <Test> tests) {
		this.tests = tests;
	}
	
}

package models;

import javax.persistence.*;


@Entity
@Table(name = "Answer")
public class Answer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "text")
	private String text;
	@ManyToOne
	@JoinColumn(name = "question")
	private Question question;
	
	public Answer() {		
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
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}

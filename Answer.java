package models;

public class Answer {

	private Long id;
	private String answ;
	private Question question;
	
	public Long GetId() {
		return id;
	}	
	public void SetId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}

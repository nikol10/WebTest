package models;

public class Answer {

	private Long id;
	private String answer;
	private Question question;
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}

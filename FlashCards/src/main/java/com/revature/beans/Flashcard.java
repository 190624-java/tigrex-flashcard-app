package com.revature.beans;

public class Flashcard {
	private int id;
	private String question;
	private String answer;
	private int deckId;
	
	public Flashcard(int id, String question, String answer, int deckId) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.deckId = deckId;
	}

	public Flashcard(String question, String answer, int deckId) {
		super();
		this.question = question;
		this.answer = answer;
		this.deckId = deckId;
	}
	
	public Flashcard(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getDeckId() {
		return deckId;
	}

	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}
	
	

}

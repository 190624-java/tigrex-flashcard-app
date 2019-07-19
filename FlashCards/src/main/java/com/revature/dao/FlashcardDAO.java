package com.revature.dao;

import java.util.List;

import com.revature.beans.Flashcard;

public interface FlashcardDAO {
	
	void createFlashcard(String question, String answer);
	List<Flashcard> getAll();
	
	void createFlashcardDeck(String question, String answer, int deckId);
	List<Flashcard> getDeck(int deckId);


}

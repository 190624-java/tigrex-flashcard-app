package com.revature.dao;

import java.sql.Connection;
import java.util.List;

import com.revature.beans.Flashcard;

public interface FlashcardDAO {
	
	void createFlashcard(String question, String answer, Connection con);
	List<Flashcard> getAll(Connection con);
	
	void createFlashcardDeck(String question, String answer, int deckId);
	List<Flashcard> getDeck(int deckId);


}

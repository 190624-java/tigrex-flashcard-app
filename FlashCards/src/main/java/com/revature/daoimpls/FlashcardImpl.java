package com.revature.daoimpls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Flashcard;
import com.revature.dao.FlashcardDAO;

public class FlashcardImpl implements FlashcardDAO {

	private Connection con = null;
	
	public FlashcardImpl() {
		try {
			Connection connection = DbConnectionHandler.getConnection();
			con = connection;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void createFlashcard(String question, String answer) {
		// TODO Auto-generated method stub
		try {
			String sql = "Insert Into flashcards (question, answer)"
					+ " Value (?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, question);
			stmt.setString(2, answer);
			
			stmt.executeUpdate();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Flashcard> getAll() {
		try {
			String sql = "Select * From flashcards";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet results = stmt.executeQuery();
			List<Flashcard> cards = new ArrayList<>();
			while(results.next()) {
				int id = results.getInt("fc_id");
				String questions = results.getString("question");
				String answers = results.getString("answer");
				int deck = results.getInt("deck");
				cards.add(new Flashcard(id, questions, answers, deck));
			}
			return cards;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void createFlashcardDeck(String question, String answer, int deckId) {
		try {
			String sql = "Insert Into flashcards (question, answer, deck)"
					+ " Value (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, question);
			stmt.setString(2, answer);
			stmt.setInt(3, deckId);
			
			stmt.executeUpdate();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Flashcard> getDeck(int deckId) {
		try {
			String sql = "Select * From flashcards Where deck = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, deckId);
			
			ResultSet results = stmt.executeQuery();
			List<Flashcard> cards = new ArrayList<>();
			while(results.next()) {
				int id = results.getInt("fc_id");
				String questions = results.getString("question");
				String answers = results.getString("answer");
				int deck = results.getInt("deck");
				cards.add(new Flashcard(id, questions, answers, deck));
			}
			return cards;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}

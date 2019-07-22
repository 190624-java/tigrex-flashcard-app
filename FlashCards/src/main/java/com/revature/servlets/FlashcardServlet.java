package com.revature.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Flashcard;
import com.revature.dao.FlashcardDAO;
import com.revature.daoimpls.DbConnectionHandler;
import com.revature.daoimpls.FlashcardImpl;


public class FlashcardServlet extends HttpServlet {
	
	private FlashcardDAO flash = new FlashcardImpl();
	private Connection con;
	
	@Override
	public void init() throws ServletException {
		try {
			con = DbConnectionHandler.getConnection();
			System.out.println("We got a connection");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Flashcard> cards = flash.getAll(con);
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().print(mapper.writeValueAsString(cards));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String question = request.getParameter("question");
		String answer = request.getParameter("answer");
		System.out.println("Question: " + question);
		System.out.println("Answer: " + answer);
		flash.createFlashcard(question, answer, con);
		response.setStatus(201);
	}
	
	@Override
	public void destroy() {
		try {
			DbConnectionHandler.getConnection().close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

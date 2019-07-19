package com.revature.daoimpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionHandler {
	
	private static final String url = "jdbc:oracle:thin:"+
			"@wlachdb.csnxeuhcdr1s.us-east-2.rds.amazonaws.com"+
			":1521:ORCL";
	private static final String username = "willLach";
	private static final String password = "Database64";
	
	public static Connection getConnection() throws SQLException {
		//THIS WILL BE ON THE TEST AND IN CLIENT INTERVIEWS
		return DriverManager.getConnection(url, username, password);
	}

}
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;
//code Reuseability use here
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_2", "root", "rahul");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
}
}

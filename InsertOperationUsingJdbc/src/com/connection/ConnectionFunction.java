package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFunction {
	public static Connection getConnection() {
		Connection connection=null;
		try {

			System.out.println("step01");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("step02");
			String url = "jdbc:mysql://localhost:3306/ecommerce_app?characterEncoding=utf8";
			connection = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}

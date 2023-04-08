package com.FetchDataFrmDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.ConnectionFunction;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// step01
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println();

		// step02
		String url = "jdbc:mysql://localhost:3306/flipkartempdb?characterEncoding=utf8";
		Connection connection = DriverManager.getConnection(url, "root", "root");
		System.out.println();

		// step03
		String sqlquery = "select*from emp";
		PreparedStatement prepare = connection.prepareStatement(sqlquery);
		System.out.println();

		// step04
		ResultSet rst = prepare.executeQuery();
		
	
		while (rst.next()) {
			System.out.println("ID>>"+rst.getInt(1));
			System.out.println("NAME>>"+rst.getString(2));
			System.out.println("SALARY>>"+rst.getInt(3));
			System.out.println(" ");
		}
		System.out.println("Table Content seen on Console Successfully");
	}
}
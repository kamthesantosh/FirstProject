package com.InsertOpearation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionFunction;

public class ConnectJavaAppToDataBase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionFunction.getConnection();
		System.out.println("step03");
		Statement statement = connection.createStatement();
		System.out.println("step04");
		String sql = "insert into product(prodWt,prodName,prodPrice) values('4.9gm','Rimsoap',10)";
		boolean isInserted = statement.execute(sql);
		System.out.println("Record Inserted successfully if return false:" + isInserted);
	}
}

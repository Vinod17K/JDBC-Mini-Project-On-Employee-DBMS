package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RemainingEmployess {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from infosysemp");
			while(resultSet.next()) {
				System.out.println("The ID is:"+resultSet.getInt(1));
				System.out.println("The name is:"+resultSet.getString(2));
				System.out.println("The age is:"+resultSet.getInt(3));
				System.out.println("The gender is:"+resultSet.getString(4));
				System.out.println("The Phono is:"+resultSet.getInt(5));
				System.out.println("The designation is:"+resultSet.getString(6));
				System.out.println("The Sal is:"+resultSet.getInt(7));
				System.out.println("--------------------------------------");
			}
			System.out.println("Data saved");
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

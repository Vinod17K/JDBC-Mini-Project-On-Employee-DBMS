package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Infosys {

	public static void main(String[] args) {

		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into infosysemp values(101,'vinod',23,'male',9108,'Softwareenginner',200000)");
			statement.execute("insert into infosysemp values(102,'shreas',21,'male',9108,'Softwareenginner',200000)");
			statement.execute("insert into infosysemp values(103,'rocky',60,'male',9108,'Java Developer',200000)");
			statement.execute("insert into infosysemp values(104,'pawar',22,'male',9908,'Java Developer',200000)");
			statement.execute("insert into infosysemp values(105,'yuvi',23,'male',9908,'Java Developer',200000)");
			statement.execute("insert into infosysemp values(106,'chaitra',23,'male',9108,'Java Developer',200000)");
			statement.execute("insert into infosysemp values(107,'yash',23,'male',91081,'Java Developer',200000)");
			statement.execute("insert into infosysemp values(108,'raj',23,'male',910810,'Java Developer',20000)");
			statement.execute("insert into infosysemp values(109,'king',23,'male',91081,'Java Developer',10000)");
			statement.execute("insert into infosysemp values(110,'guldu',65,'male',91081,'Java Developer',40000)");
			System.out.println("Data saved");
			connection.close();

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

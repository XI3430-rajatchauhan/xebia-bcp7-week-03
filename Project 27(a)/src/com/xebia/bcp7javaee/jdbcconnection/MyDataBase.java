package com.xebia.bcp7javaee.jdbcconnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class MyDataBase {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://bcp7-java-db-01.cs4gnvom3jcr.ap-south-1.rds.amazonaws.com" + "user=rajatc&passwprd=bcp7javaee");
			Statement statement=connect.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from Employees");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
			}
			connect.close();
		} catch(Exception e) {
			System.out.println((e));
		}

	}

}

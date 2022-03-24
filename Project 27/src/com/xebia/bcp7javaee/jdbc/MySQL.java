package com.xebia.bcp7javaee.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySQL {
	private Connection connect=null;
	private Statement statement=null;
	private PreparedStatement preparedStatement=null;
	private ResultSet resultSet=null;
	public void readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://bcp7-java-db-01.cs4gnvom3jcr.ap-south-1.rds.amazonaws.com" + "user=rajatc&passwprd=bcp7javaee");
			statement=connect.createStatement();
			resultSet=statement.executeQuery("select * from rajat.bcp7javaee.Employees");
			writeResultSet(resultSet);
			preparedStatement=connect.prepareStatement("insert into rajat.bcp7javaee.Employees values (default, ?, ?, ?, ?");
			preparedStatement.setString(1,  "Rajat");
			preparedStatement.setString(2,  "rajat@gmail.com");
			preparedStatement.setString(3,  "This is rajat jdbc connection");
			preparedStatement.setString(4,  "Palwal");
			preparedStatement.executeUpdate();
			preparedStatement=connect.prepareStatement("SELECT emp_name, emp_email, emp_remarks, emp_city from rajat.bcp7javaee.Employees");
			resultSet=preparedStatement.executeQuery();
			writeResultSet(resultSet);
			preparedStatement=connect.prepareStatement("delete from rajat.bcp7javaee.Employees where emp_name=?;");
			preparedStatement.setString(1,  "Rajat");
			preparedStatement.executeUpdate();
			resultSet=statement.executeQuery("select * from rajat.bcp7javaee.Employees");
			writeMetaData(resultSet);
			} catch (Exception e) {
				throw e;
	} finally {
		close();
	}
	
		
	}
	private void writeMetaData(ResultSet resultSet) throws SQLException {
		System.out.println("The columns in the table are: ");
		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i=1;i<=resultSet.getMetaData().getColumnCount();i++) {
			System.out.println("Column " +i + " "+ resultSet.getMetaData().getColumnName(i));
		}
	}
	private void writeResultSet(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			String name=resultSet.getString("emp_name");
			String email=resultSet.getString("emp_email");
			String remark=resultSet.getString("emp_remarks");
			String city=resultSet.getString("emp_city");
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);
			System.out.println("Remark: " + remark);
			System.out.println("City: " + city);
		}
	}
	private void close() {
		try {
			if (resultSet !=null) {
				resultSet.close();
			}
			if (statement !=null) {
				statement.close();
			}
			if (connect !=null) {
				connect.close();
			}
		} catch (Exception e) {
			
		}
	}

}

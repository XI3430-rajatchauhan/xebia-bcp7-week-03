package com.xebia.bcp7javaee.connection;
import com.xebia.bcp7javaee.jdbc.MySQL;

public class Manger {

	public static void main(String[] args) throws Exception {
		MySQL dao=new MySQL();
		dao.readDataBase();

	}

}

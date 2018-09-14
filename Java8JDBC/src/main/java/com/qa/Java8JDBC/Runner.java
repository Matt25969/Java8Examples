package com.qa.Java8JDBC;

import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {

		try {
			Connector.connect();

			Connector.insertExample();

			Connector.readExample();

			Connector.updateExample();

			Connector.readExample();

			Connector.deleteExample();

			Connector.readExample();

			System.out.println("-----------------------------------------------------------");

			System.out.println(Connector.getUser(102));

			System.out.println("-----------------------------------------------------------");

			// Connector.closeConn();

			Connector.tryWithResources();

			Connector.readExample();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

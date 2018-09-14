package com.qa.Java8JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Connector {

	static Connection con = null;

	public static void connect() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
		// here mydb is database name, root is username and password is password

	}

	public static void insertExample() throws SQLException {

		Statement stmt = con.createStatement();

		stmt.executeUpdate("insert into author (Name, DOB, Age) VALUES ('Bert', 'sometime', 4) ");

	}

	public static void readExample() throws SQLException {

		Statement stmt = con.createStatement();
		// author is a table held in mydb
		ResultSet rs = stmt.executeQuery("select * from author");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

	}

	public static void updateExample() throws SQLException {

		Statement stmt = con.createStatement();

		String sql3 = "UPDATE author SET age = 1994 WHERE id = 101";

		stmt.executeUpdate(sql3);

	}

	public static void deleteExample() throws SQLException {

		Statement stmt = con.createStatement();

		String sql = "DELETE FROM author where id = 101";

		stmt.executeUpdate(sql);

	}

	public static void closeConn() throws SQLException {

		con.close();

	}

	public static void tryWithResources() throws SQLException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password")) {

			Class.forName("com.mysql.jdbc.Driver");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from author");
			while (rs.next())
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(con.isClosed());
		}

	}

	public static List<String> getUser(int userId) throws SQLException {
		String sql = "SELECT Name FROM author WHERE id = ?";
		List<String> users = new ArrayList<>();
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, userId);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					users.add(rs.getString("Name"));
				}
			}
			System.out.println(con.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(con.isClosed());
		}

		return users;
	}

}

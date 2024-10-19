package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

	String url = "jdbc:mysql://localhost:3306/bookdb";
	String dbuser = "root";
	String dbpwd = "Vamshi@130";

	public List<Book> getDetails() throws Exception {
		 // Connect to database
		 Connection con = DriverManager.getConnection(url, dbuser, dbpwd);
		 PreparedStatement ps = con.prepareStatement("SELECT * FROM book");
		 
		 ResultSet rs = ps.executeQuery();
		 List<Book> bookList = new ArrayList<>();
		 while (rs.next()) {
		 Book book = new Book();
		 book.setBid(rs.getInt(1));
		 book.setBname(rs.getString(2));
		 book.setBprice(rs.getDouble(3));
		 bookList.add(book);
		 }
		 return bookList;
	 }

}

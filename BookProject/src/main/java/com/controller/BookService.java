package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Book;
import com.model.BookManager;

public class BookService extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try {
			BookManager bookManager = new BookManager();
			List<Book> bookList = bookManager.getDetails();
			pw.print("<html><title>Book Details</title><body><h1>Books Available</h1><br>");
			pw.print("<table border='1'>");
			pw.print("<tr><th>Book ID</th><th>Book Name</th><th>Book Price</th></tr>");
			for (Book book : bookList) {
				pw.print("<tr><td>" + book.getBid() + "</td><td>" + book.getBname() + "</td><td>" + book.getBprice()
						+ "</td></tr>");
			}
			pw.print("</table>");
			pw.print("</body></html>");
		} catch (Exception e) {
			pw.print("<html><body>");
			pw.print("<p>Error: " + e.getMessage() + "</p>");
			pw.print("</body></html>");
		} finally {
			pw.close();
		}
	}

}

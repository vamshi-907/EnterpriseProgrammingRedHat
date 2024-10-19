package com.signup;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/students_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Vamshi@130";
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String email = request.getParameter("email");
	        String firstName = null;
	        String lastName = null;
 
	        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
	            String sql = "SELECT firstname, lastname FROM users WHERE email = ?";
	            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
	                stmt.setString(1, email);
	                try (ResultSet rs = stmt.executeQuery()) {
	                    if (rs.next()) {
	                        firstName = rs.getString("firstname");
	                        lastName = rs.getString("lastname");
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
 
	        if (firstName != null && lastName != null) {
	            // Set the retrieved data as request attributes
	            request.setAttribute("firstname", firstName);
	            request.setAttribute("lastname", lastName);
	            request.setAttribute("email", email);

	            // Forward the request to the welcome JSP page
	            request.getRequestDispatcher("welcome.jsp").forward(request, response);
	        } else {
	            // If no user is found, redirect back to the login page with an error message
	            response.sendRedirect("login.jsp?error=Invalid%20email");
	        }
	}

}

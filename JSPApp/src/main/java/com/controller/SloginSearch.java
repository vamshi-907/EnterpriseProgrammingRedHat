package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Slogin;
import com.model.SloginAdmin;

public class SloginSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SloginAdmin sa = new SloginAdmin();
	Slogin s = new Slogin();
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("username");
		
		
		try {
				List<Slogin> L = sa.searchSlogin(s);
				request.setAttribute("res2", L);
				RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
				rd.forward(request, response);

			}
			catch(Exception e)
			{
				
			}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

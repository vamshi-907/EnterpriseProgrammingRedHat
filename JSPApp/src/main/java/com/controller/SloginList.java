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

/**
 * Servlet implementation class SloginList
 */
public class SloginList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try
		{
			SloginAdmin sa = new SloginAdmin();
			List<Slogin> L = sa.SlogingetALL();
			request.setAttribute("res2", L);
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


}

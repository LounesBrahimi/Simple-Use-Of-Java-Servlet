package com.lounes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String paramAuthor = request.getParameter( "Author" );
		String message = "Transmission of arguments : OK ! " + paramAuthor;
		request.setAttribute( "test", message );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
	}
}
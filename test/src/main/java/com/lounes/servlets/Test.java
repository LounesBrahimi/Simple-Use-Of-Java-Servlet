package com.lounes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lounes.bean.Bean;

public class Test extends HttpServlet {
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String paramAuthor = request.getParameter( "Author" );
		String message = "Transmission of arguments : OK ! ";
		
		/* Creation of bean */
		Bean firstBean = new Bean();
		/* Initialisation*/
		firstBean.setLastName( "Le" );
		firstBean.setFirstName( "Duc" );
			
		/* Store the bean in the request object */
		request.setAttribute( "test", message );
		request.setAttribute( "TheBean", firstBean );
		request.setAttribute( "test", message );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
	}
}
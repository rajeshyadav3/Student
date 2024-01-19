package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TeacherHomePage")
public class TeacherHomePage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//String emailId = request.getParameter("emailId");
		
		HttpSession session = request.getSession(false);
		String emailId = (String) session.getAttribute("emailId");
		
		out.println("<body bgcolor='lightyellow' text='green'>");
		
		//for username
		out.print("<h3 style='color:red;'>Welcome " + emailId + "!</h3>");
		
		//for Logout
		out.print("<form align='right'>");
		out.print("<a href='TeacherHomePage'>Home</a> &nbsp;");
		out.print("<a href='Logout'>Logout</>");
		out.print("<form>");
		
		
		out.println("<center>");
		out.println("<h1>Welcome to TeacherHomePage</h1>");
		
		out.println("<h3><a href='GetAllStuds'>GetAllStudents</a> &nbsp; &nbsp;");
		out.println("<a href='GetStudById.jsp'>GetStudById</a>");
		out.println("</h3> <br/>");
		
		out.println("</center>");
		out.println("</body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
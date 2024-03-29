package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.StudentDAO;
import com.DTO.Student;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String stdName = request.getParameter("stdName");
		String Batch = request.getParameter("Batch");
		String gender = request.getParameter("gender");
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		Student std = new Student(0, stdName, Batch, gender, emailId, password);
		
		StudentDAO stdDao = new StudentDAO();
		int result = stdDao.registerStudent(std);
		
		out.println("<center>");
		
		if (result > 0) {			
			out.println("<h1 style='color:green;'>Student Registered Successfully!!!</h1> <br/>");
					
			RequestDispatcher rd = request.getRequestDispatcher("LoginPage.html");
			rd.include(request, response);
			
		} else {			
			
			RequestDispatcher rd = request.getRequestDispatcher("RegisterPage.html");
			rd.include(request, response);
			
			out.println("<h1 style='color:red;'>Unable Register the Student Recored!!!</h1>");
		}
		out.println("<center>");
	}


        
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

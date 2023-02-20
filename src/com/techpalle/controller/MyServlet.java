package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;


@WebServlet("/My")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String name=request.getParameter("tbname");
	String email=request.getParameter("tbemail");
	
	String password=request.getParameter("tbpass");
	String course=request.getParameter("tbcourse");
	String coursetype=request.getParameter("tbtype");
	
	
	Student s1=new Student(name, email, password,course, coursetype);
	DataAccess.insertStudent(s1);
	
	//response.sendRedirect("login.jsp");
	
	RequestDispatcher rs=request.getRequestDispatcher("login.jsp");
	rs.forward(request, response);
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

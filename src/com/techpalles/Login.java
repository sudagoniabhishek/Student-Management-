package com.techpalles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Log")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute","root","abhi");
			String e=request.getParameter("tbemail");
			String p=request.getParameter("tbpass");
			String s="select email from student where email=? and password=?";
			
			PreparedStatement ps=con.prepareStatement(s);
			
			ps.setString(1, e);
			ps.setString(2, p);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
				
			}
			else {
				
				pw.println("<font color=red size=18>Login Failed!!<br>");
				pw.println("<a href=login.jsp>Try AGAIN!!</a>");
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

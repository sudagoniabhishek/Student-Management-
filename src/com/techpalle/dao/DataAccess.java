package com.techpalle.dao;

import java.sql.*;

import com.techpalle.model.Student;

public class DataAccess {
	public static Connection con=null;
	public static PreparedStatement ps=null;
	public static void insertStudent(Student s) {
		
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "abhi");
	        
	        String qry="insert into Student(name,email,password,course,coursetype) values(?,?,?,?,?)";
	        ps=con.prepareStatement(qry);
	        ps.setString(1, s.getName());
	        ps.setString(2,s.getEmail());
	        ps.setString(3, s.getPassword());
	        ps.setString(4, s.getCourse());
	        ps.setString(5, s.getCoursetype());
	        
	        ps.executeUpdate();
	               
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		finally {
			try {
				if(ps!=null) {
				ps.close();
				}
				if(con!=null) {
					con.close();
					}
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		
	}
		
	}
}


	


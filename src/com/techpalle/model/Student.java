package com.techpalle.model;

public class Student {
	
	
	private String name;
	private String email;
	private String password;
	private String course;
	private String coursetype;
	
	public Student(String name, String email, String password, String course, String coursetype) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.course = course;
		this.coursetype = coursetype;
	}
	private int sno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

}

package com.mypro.dao;

import java.util.List;

import com.mypro.model.Student;



public interface StudentDAO {

public int saveStudent(Student student);
	
	public void delete(int rollno);
	
	public int update(Student student);
	
	public Student getStudent(int rollno);
	
	public List<Student> fetchall();
}

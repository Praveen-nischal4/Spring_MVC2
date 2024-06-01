package com.mypro.service;

import java.util.List;

import com.mypro.dao.StudentDAO;
import com.mypro.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentserviceImpl implements StudentService{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public int saveStudent(Student student) {
		
		return studentDAO.saveStudent(student);
	}

	@Override
	public void delete(int rollno) {
	
		studentDAO.delete(rollno);
		
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.update(student);
	}

	@Override
	public Student getStudent(int rollno) {
		return studentDAO.getStudent(rollno);
	}

	@Override
	public List<Student> fetchall() {
		return studentDAO.fetchall();
	}

}

package com.ty.spring_boot_Student_App.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.ty.spring_boot_Student_App.dto.Student;
import com.ty.spring_boot_Student_App.repository.Student_Repository;

@Repository
public class Student_Dao
{
	@Autowired
	private Student_Repository repository;
	
	public void SaveStudents(Student student)
	{
		repository.save(student);
	}
	
//	public Optional <Student> findById(int id) {
//		Optional <Student> student = repository.findById(id);
//		return student;
//	}
	
	public Student findById(int id)
	{
		Student student = repository.findById(id);
		return student;
	}
	
	public Student ValidateStudent(Student student)
	{
		return repository.ValidateStudent(student.getEmail(),student.getPwd());
	}
}

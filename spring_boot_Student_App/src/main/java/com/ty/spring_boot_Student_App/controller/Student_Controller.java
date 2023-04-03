package com.ty.spring_boot_Student_App.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.spring_boot_Student_App.dao.Student_Dao;
import com.ty.spring_boot_Student_App.dto.Student;

@RestController
public class Student_Controller 
{
	@Autowired
	private Student_Dao dao;
	@PostMapping("/save")
	public void SaveStudent(@RequestBody Student student)
	{
		dao.SaveStudents(student);
	}
//	@GetMapping("/find/id")
//	public Optional<Student> find(@RequestParam int id)
//	{
//		Optional<Student> student = dao.findById(id);
//		return student;
//	}
	
	@GetMapping("/find/id")
	public Student find(@RequestParam int id)
	{
		return dao.findById(id);
	}
	@PostMapping("student/loging")
	public Student ValidateStudent(@RequestBody Student student)
	{
		return dao.ValidateStudent(student);
	}
}

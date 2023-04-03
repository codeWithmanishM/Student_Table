package com.ty.spring_boot_Student_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ty.spring_boot_Student_App.dto.Student;

public interface Student_Repository extends JpaRepository<Student, Integer> {
	Student findById(int id);
	
	@Query("select s from Student s where s.email =:myemail AND s.pwd =:mypassword")
	public  Student ValidateStudent(@Param("myemail")String email, @Param("mypassword")String pwd);
}

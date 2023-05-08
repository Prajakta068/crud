package com.management.service;

import java.util.List;
import com.management.entity.Student;
public interface StudentService {
	
	
	List<Student> getAllStduents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);

	void deleteStudentById(Long id);
	
}

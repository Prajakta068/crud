package com.management.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Student;
import com.management.service.StudentService;
import com.management.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
//when spring bean only one constructor then we can avoid autowired annotation becoz spring bean only one constructor	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStduents() {
		
		return studentRepository.findAll();//findAll method basically return list of students
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}

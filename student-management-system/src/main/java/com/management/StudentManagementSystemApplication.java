package com.management;

import org.springframework.beans.factory.annotation.Autowired;

import com.management.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.management.repository.StudentRepository;
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
//		Student student1 = new Student("priya","patel","pri01@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("kirti","nion","nion1@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("madhura","kadu","kadumadhu2@gmail.com");
//		studentRepository.save(student3);
		
	}

}

package com.vu2rmk.studentmanagementsystem;

import com.vu2rmk.studentmanagementsystem.entity.Student;
import com.vu2rmk.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Ram","Krishna", "vu2rmk@gmail.com");
//		studentRepository.save(student1);
//
//		Student student = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		studentRepository.save(student);
//
//		Student student2 = new Student("Rah", "Ver", "rah@gmail.com");
//		studentRepository.save(student2);
	}
}

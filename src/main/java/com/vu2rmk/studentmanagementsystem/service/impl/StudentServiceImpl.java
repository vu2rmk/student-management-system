package com.vu2rmk.studentmanagementsystem.service.impl;

import com.vu2rmk.studentmanagementsystem.entity.Student;
import com.vu2rmk.studentmanagementsystem.repository.StudentRepository;
import com.vu2rmk.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

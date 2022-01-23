package com.vu2rmk.studentmanagementsystem.service;

import com.vu2rmk.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
}

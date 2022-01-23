package com.vu2rmk.studentmanagementsystem.repository;

import com.vu2rmk.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

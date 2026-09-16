package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.webapp.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
Student findByStudentnameAndPassword(String studentname, String password);
}

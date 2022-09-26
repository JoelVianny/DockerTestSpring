package com.example.dockertestspring.repository;

import com.example.dockertestspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository  extends JpaRepository<Student,Long> {
}

package com.example.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.studentmanagementsystem.entity.Student;

//Simple Jpa repository in implentation of Jpa repository provides default transactional and repository annotation
public interface StudentRepository extends JpaRepository<Student, Long>{

	
	
}

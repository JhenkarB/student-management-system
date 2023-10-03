package com.example.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import com.example.studentmanagementsystem.service.StudentService;


@Service
public class StudentServiceimpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	//constrcutor injection onde method edre autowired antha bariyod yen beda spring ge goth aguthe
	public StudentServiceimpl(StudentRepository studentRepository) {
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

package com.jspiders.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.studentmanagement.dto.StudentDTO;
import com.jspiders.studentmanagement.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentDTO insertStudent(StudentDTO student) {
		StudentDTO savedStudent = repository.save(student);
		return savedStudent;
	}

	@Override
	public StudentDTO searchByName(String name) {
		StudentDTO findByName = repository.findByName(name);
		return findByName;
	}

}


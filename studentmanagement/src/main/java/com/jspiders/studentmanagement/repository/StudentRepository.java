package com.jspiders.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.studentmanagement.dto.StudentDTO;

public interface StudentRepository extends CrudRepository<StudentDTO, Integer> {

	StudentDTO findByName(String name);
}


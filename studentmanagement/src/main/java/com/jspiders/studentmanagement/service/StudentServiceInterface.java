package com.jspiders.studentmanagement.service;

import com.jspiders.studentmanagement.dto.StudentDTO;

public interface StudentServiceInterface {

	StudentDTO insertStudent(StudentDTO student);

	StudentDTO searchByName(String name);

}



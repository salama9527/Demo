package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.StudentDaoImpl;
import com.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
@Autowired
StudentDaoImpl sd;

	@Override
	public String save(Student s) {
		String msg=sd.insert(s);
		return msg;
	}

	@Override
	public Student retrieve() {
		
		return null;
	}
 
}

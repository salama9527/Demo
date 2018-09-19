package com.dao;

import java.util.HashMap;
import com.domain.Student;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl implements StudentDao{
	
@Autowired
JdbcTemplate temp;

public StudentDaoImpl() {
	System.out.println("hello con");
}
@Override
public String insert(Student s) {
	System.out.println("gdwgedweu23erdghwefd67wevdhgrweydfwetrdhgafdqw56feytrf");
	/*Map<String,Object> m=new HashMap<>();
	m.put("id", s.getId());
	m.put("name", s.getName());
	m.put("age", s.getAge());
	temp.execute(m);*/
	return "data Inserted successfully";
	
	
}
@Override
public Student retrieve() {
	
	return null;
}
}

package com.dao;

import org.springframework.stereotype.Component;

import com.domain.Student;

public interface StudentDao {
public String insert(Student s);
public Student retrieve();
}

package com.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;




@Configuration
@ComponentScan(basePackages={"com.dao","com.domain","com.service"})
public class Config {
	/*@Autowired
	private DataSource ds;
	*/
	/*@Bean
	public SimpleJdbcInsert getTemp(){
		return new SimpleJdbcInsert(ds).withTableName("student_detail");
		
	}*/

	
	

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.controller.Config;

@SpringBootApplication
@Import(Config.class)
public class Demo123Application {

	public static void main(String[] args) {
		
	ApplicationContext c=SpringApplication.run(Demo123Application.class, args);
	}
}

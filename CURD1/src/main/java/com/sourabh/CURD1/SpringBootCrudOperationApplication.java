package com.sourabh.CURD1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.sourabh.CURD1"})
public class SpringBootCrudOperationApplication {
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/books");
		SpringApplication.run(SpringBootCrudOperationApplication.class, args);
	}
}
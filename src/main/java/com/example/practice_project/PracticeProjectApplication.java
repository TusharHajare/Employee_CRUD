package com.example.practice_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeProjectApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(PracticeProjectApplication.class, args);
	    
		try {
	    int a = 14/0;
		}
		catch(Exception e) {
			System.out.println("Error : "+ e.getMessage());
		}
	    System.out.println("Welcome...!");
	}

}

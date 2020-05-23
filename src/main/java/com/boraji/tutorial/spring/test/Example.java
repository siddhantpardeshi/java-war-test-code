package com.boraji.tutorial.spring.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encoded=new BCryptPasswordEncoder().encode("admin@123");
		System.out.println("encoded::::::::::::"+encoded);
	}

}

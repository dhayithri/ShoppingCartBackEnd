package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;

public class UserDetailsTest {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	
	UserDetailsDAO userDetailsDAO =   (UserDetailsDAO) context.getBean("userDetailsDAO");
	UserDetails userDetails=(UserDetails)context.getBean("userDetails");
	

	userDetails.setId("CG001");
	userDetails.setName("CGName001");
	userDetails.setDescription("This is category001 description");
	if (userDetailsDAO.save(userDetails) == true)
		
	{
	System.out.println("UserDetails created successfully");

	}
	else
	{
		System.out.println("not able to create userdetails");
	}
	}}
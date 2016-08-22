package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTest {

	public static void main(String[] args)
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	
	ProductDAO productDAO =   (ProductDAO) context.getBean("productDAO");
	Product product=(Product)context.getBean("product");

	product.setId("PRD_001");
	product.setName("PRDName001");
	product.setDescription("This is product001 description");
	if (productDAO.save(product) == true)
		
	{
	System.out.println("Product created successfully");

	}
	else
	{
		System.out.println("not able to create product");
	}
	}
	}

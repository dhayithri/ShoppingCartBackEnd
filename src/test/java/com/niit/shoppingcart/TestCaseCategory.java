package com.niit.shoppingcart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class TestCaseCategory {
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	AnnotationConfigApplicationContext context;
	@Before
	public void init()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO =(CategoryDAO) context.getBean("categoryDAO");
		category= (Category) context.getBean("category");
	}
	
	@Test
	public void categoryListTestCase()
	{
		List<Category> list = categoryDAO.list();
		int rowCount= list.size();
		assertEquals("category Lisi Test case", rowCount,5);
     }
	@Test
	public void categoeyAddTestcase()
	{
		category.setId("surfthjg");
		category.setName("njsgd");
		category.setDescription("werfcg");
		boolean flag= categoryDAO.save(category);
		assertEquals(flag, true);
	}
	
	@Test
	public void categoryGetTestCase()
	{
		category = categoryDAO.get("CG001");
		
		System.out.println(category.getDescription());
		System.out.println(category.getName());
		assertEquals(category.getName(),"asdfadge");
		
	}
}

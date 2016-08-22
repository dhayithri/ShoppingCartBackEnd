package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	
	SupplierDAO supplierDAO =   (SupplierDAO) context.getBean("supplierDAO");
	Supplier supplier=(Supplier)context.getBean("supplier");
	

	supplier.setId("SUP001");
	supplier.setName("SUPName001");
    supplier.setAddress("chennai");
	if (supplierDAO.save(supplier) == true)
		
	{
	System.out.println("Supplier created successfully");

	}
	else
	{
		System.out.println("not able to create supplier");
		System.out.println(" no of suppliers" + supplierDAO.list().size());
	}
	}}
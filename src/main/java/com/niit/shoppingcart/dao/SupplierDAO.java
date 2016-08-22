package com.niit.shoppingcart.dao;

import java.util.List;
import com.niit.shoppingcart.model.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDAO {
	
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(Supplier supplier);
	public Supplier get(String id);
	public List<Supplier> list();
	
	
	
}


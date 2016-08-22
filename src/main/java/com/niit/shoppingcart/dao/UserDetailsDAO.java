package com.niit.shoppingcart.dao;

import java.util.List;
import com.niit.shoppingcart.model.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsDAO {
	
	public boolean save(UserDetails userdetails);
	public boolean update(UserDetails userdetails);
	public boolean delete(UserDetails userdetails);
	public UserDetails get(String id);
	public List<UserDetails> list();
	
	
}


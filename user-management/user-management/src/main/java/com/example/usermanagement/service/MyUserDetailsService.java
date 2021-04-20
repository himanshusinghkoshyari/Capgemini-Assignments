package com.example.usermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.usermanagement.dao.CustomerDao;
import com.example.usermanagement.model.Customer;
import com.example.usermanagement.model.MyUserDetails;


@Component
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	CustomerDao repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 Optional<Customer> customer = repo.findByUsername(username);
		

	        return customer.map(MyUserDetails::new)
	        		   .orElseThrow(()->new  UsernameNotFoundException(username+"Not found"));
	}

}

package com.example.usermanagement.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4560280151120433912L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getAddress() {
		return address;
	}

	private Boolean isActive;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private List<GrantedAuthority> authorities;
	
	 public MyUserDetails(Customer customer) {
	        this.username = customer.getUsername();
	        this.password = customer.getPassword();
	        this.isActive = customer.getIsActive();
	        this.name=customer.getName();
	        this.email=customer.getEmail();
	        this.phoneNo=customer.getPhoneNo();
	        this.address=customer.getAddress();
	        this.authorities = Arrays.stream(customer.getRole().split(","))
	                    .map(SimpleGrantedAuthority::new)
	                    .collect(Collectors.toList());
	    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isActive;
	}
	

}

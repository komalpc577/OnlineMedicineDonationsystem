package com.Executive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Executive")
public class Executive {
	@Id
	private int executiveId;
	private String username;
	private String email;
	private String address;
	private String mobile;
	private String password;
	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Executive(int executiveId, String username, String email, String address, String mobile, String password) {
		super();
		this.executiveId = executiveId;
		this.username = username;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.password = password;
	}
	public int getExecutiveId() {
		return executiveId;
	}
	public void setExecutiveId(int executiveId) {
		this.executiveId = executiveId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

package com.adminservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NGO {
	@Id
	private int id;
	private String password;
	private String username;
	private String nEmailid;
	private String nAddress;
	private String nPhonenumber;
	public NGO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NGO(int id, String password, String username, String nEmailid, String nAddress, String nPhonenumber) {
		super();
		this.id = id;
		this.password = password;
		this.username = username;
		this.nEmailid = nEmailid;
		this.nAddress = nAddress;
		this.nPhonenumber = nPhonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setNgoName(String ngoName) {
		this.username= username;
	}
	public String getnEmailid() {
		return nEmailid;
	}
	public void setnEmailid(String nEmailid) {
		this.nEmailid = nEmailid;
	}
	public String getnAddress() {
		return nAddress;
	}
	public void setnAddress(String nAddress) {
		this.nAddress = nAddress;
	}
	public String getnPhonenumber() {
		return nPhonenumber;
	}
	public void setnPhonenumber(String nPhonenumber) {
		this.nPhonenumber = nPhonenumber;
	}
	

}

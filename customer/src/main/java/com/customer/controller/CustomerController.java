package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	 private CustomerService customerservice;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer c =customerservice.addcustomer(customer);
		return c;
	}
	@GetMapping("/get")
	public List<Customer> getAllCustomer(){
		return customerservice.getAllCustomer();
		
	}

}

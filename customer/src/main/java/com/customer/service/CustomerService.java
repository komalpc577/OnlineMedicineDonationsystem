package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.Customerrepo;
@Service
public class CustomerService {
	@Autowired
	private Customerrepo customerrepo;
	
	public Customer addcustomer(Customer customer) {
		return customerrepo.save(customer);
	}
	
	public List<Customer> getAllCustomer(){
		return customerrepo.findAll();
		
	}

}

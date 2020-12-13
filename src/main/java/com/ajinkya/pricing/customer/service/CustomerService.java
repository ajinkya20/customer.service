package com.ajinkya.pricing.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajinkya.pricing.customer.entity.Customer;
import com.ajinkya.pricing.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
		System.out.println("Customer : "+customer.toString());
		return customerRepository.save(customer);
	}
	
	public Optional<Customer> findCustomerById(Long customerId) { 
		Optional<Customer> cust = customerRepository.findById(customerId);
		return cust;
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}
}

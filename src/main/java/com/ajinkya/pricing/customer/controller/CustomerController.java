package com.ajinkya.pricing.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajinkya.pricing.customer.entity.Customer;
import com.ajinkya.pricing.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

	//private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer) {
		log.info("Save Customer----");
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("{id}")
	public Optional<Customer> findCustomerById(@PathVariable("id") Long customerId) {
		return customerService.findCustomerById(customerId);
	}

	@GetMapping("/allCustomers")
	public List<Customer> findCustomerById() {
		return customerService.findAllCustomers();
	}
}

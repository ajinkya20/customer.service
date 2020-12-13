package com.ajinkya.pricing.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajinkya.pricing.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	
}

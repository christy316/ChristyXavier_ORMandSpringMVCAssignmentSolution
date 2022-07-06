package com.greatlearning.customermangment.repository;

import java.util.List;

import com.greatlearning.customermangment.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void deleteById(int id);

}
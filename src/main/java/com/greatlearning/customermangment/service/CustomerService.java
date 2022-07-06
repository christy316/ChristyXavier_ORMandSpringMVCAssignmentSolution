package com.greatlearning.customermangment.service;

import java.util.List;

import com.greatlearning.customermangment.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

	Customer findById(int id);

	void save(int studentId, String firstName, String lastName, String email);

	void deleteById(int id);

}
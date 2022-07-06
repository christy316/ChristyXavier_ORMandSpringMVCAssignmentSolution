package com.greatlearning.customermangment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.customermangment.model.Customer;
import com.greatlearning.customermangment.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int id) {

		return customerRepository.findById(id);
	}

	@Override
	public void save(int studentId, String firstName, String lastName, String email) {

		Customer customer;
		if (studentId != 0) {
			customer = customerRepository.findById(studentId);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setEmail(email);

		} else {
			customer = new Customer(firstName, lastName, email);
		}

		customerRepository.save(customer);
	}

	@Override
	public void deleteById(int id) {

		customerRepository.deleteById(id);
	}

}

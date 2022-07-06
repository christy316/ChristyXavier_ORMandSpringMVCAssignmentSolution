package com.greatlearning.customermangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.customermangment.model.Customer;
import com.greatlearning.customermangment.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String customerList(Model model) {

		List<Customer> customerList = customerService.findAll();

		model.addAttribute("Customers", customerList);

		return "list-customers";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {

		Customer customer = new Customer();
		model.addAttribute("Customer", customer);

		return "customer-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int customerId, Model modell) {

		Customer customer = customerService.findById(customerId);
	
		modell.addAttribute("Customer", customer);	
		
		return "customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("customerId") int customerId, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email) {

		customerService.save(customerId, firstName, lastName, email);

		return "redirect:/customer/list";
	}

	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int customerId) {

		customerService.deleteById(customerId);

		return "redirect:/customer/list";
	}

}

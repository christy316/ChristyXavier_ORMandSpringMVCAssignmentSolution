package com.greatlearning.customermangment.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.customermangment.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private SessionFactory sessionFactory;

	private Session session;

	CustomerRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public List<Customer> findAll() {

		Transaction tx = session.beginTransaction();

		List<Customer> customerList = session.createQuery("from Customer").list();

		tx.commit();

		return customerList;
	}

	@Override
	@Transactional
	public Customer findById(int id) {

		Customer customer = new Customer();

		Transaction tx = session.beginTransaction();

		customer = session.get(Customer.class, id);

		tx.commit();

		return customer;
	}

	@Override
	@Transactional
	public void save(Customer customer) {

		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(customer);

		tx.commit();
	}

	@Override
	@Transactional
	public void deleteById(int id) {

		Transaction tx = session.beginTransaction();

		Customer customer = session.get(Customer.class, id);

		session.delete(customer);

		tx.commit();
	}

}

package com.work.chinoog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.work.chinoog.helper.ChunkRequest;
import com.work.chinoog.model.Customer;
import com.work.chinoog.model.CustomerGenre;
import com.work.chinoog.model.CustomerRepository;
import com.work.chinoog.model.CustomerSpender;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerSpender customerSpender;


    @Autowired
    CustomerGenre customerGenre;

    // Implement the customers method to return a list of all customers
    @Override
    public List<Customer> customers() {
        return customerRepository.findAll();
    }

    // Implement the getCustomerById method to return a customer by id
    @Override
    public Optional<Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    // Implement the getCustomerByName method to return a list of customers by name
    @Override
    public List<Customer> getCustomerByName(String name) {
        return customerRepository.findByNameLike(name);
    }

    // Implement the save method to save a customer
    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    // Implement the update method to update a customer
    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    // Implement the getCountryWithMostCustomer method to return the country with the most customers
    @Override
    public String getCountryWithMostCustomer() {
        return customerRepository.findCountryWithMostCustomers();
    }

    @Override
    public Customer getHighestSpenderCustomer() {
        return customerSpender.getHighestSpenderCustomer();
    }

    @Override
    public String getMostPopularGenreOfCustomer(int id) {
        return customerGenre.findMostPopularGenreOfCustomer(id);
    }


    @Override
    public List<Customer> getCustomerLimitOffset(int limit, int offset) {
        Pageable Pageable = new ChunkRequest(offset, limit);
        return (List<Customer>) customerRepository.findAll(Pageable);
    }
}

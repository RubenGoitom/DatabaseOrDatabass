package com.work.chinoog.service;

import java.util.List;
import java.util.Optional;

import com.work.chinoog.model.Customer;

public interface CustomerService {
    public List<Customer> customers();
    public Optional<Customer> getCustomerById(int id);
    public List<Customer> getCustomerByName(String name);   
    public void save(Customer customer);
    public void update(Customer  customer);
    public String getCountryWithMostCustomer(); 
    public Customer getHighestSpenderCustomer();
    public String getMostPopularGenreOfCustomer(int id);
    public List<Customer> getCustomerLimitOffset(int limit, int offset);
}

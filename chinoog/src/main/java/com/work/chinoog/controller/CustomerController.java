package com.work.chinoog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.chinoog.model.Customer;
import com.work.chinoog.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //Handles GET request to retrieve all customers
    @GetMapping("/customers")
    public List<Customer> customers(){
        return customerService.customers();
    }

    //Handles GET request to retrieve customer by id
    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    //Handles GET request to retrieve customer by name
    @GetMapping("/customers/name/{name}")
    public List<Customer> getCustomerByName(@PathVariable("name") String name){
        return customerService.getCustomerByName(name);
    }

    //Handles POST request to save a customer
    @PostMapping("/customers")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }

    //Handles PUT request to update a customer
    @PutMapping("/customers")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
    }

    @GetMapping("/customers/max/country")
    public String getCountryWithMostCustomers(){
        return customerService.getCountryWithMostCustomer();
    }

    @GetMapping("/customers/highest/spender")
    public Customer getHighestSpenderCustomer(){
        return customerService.getHighestSpenderCustomer();
    }

    @GetMapping("/customers/popular/genre/{id}")
    public String getMostPopularGenreOfCustomer(@PathVariable("id") int id) {
        return customerService.getMostPopularGenreOfCustomer(id);
    }    

    @GetMapping("/customers/limit")
    public List<Customer> getCustomerLimitOffset(@RequestParam("limit") int limit, @RequestParam("offset") int offset){
        return customerService.getCustomerLimitOffset(limit, offset);
    }
}

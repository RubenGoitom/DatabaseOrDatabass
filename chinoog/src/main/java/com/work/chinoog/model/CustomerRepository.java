package com.work.chinoog.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public List<Customer> findByNameLike(String name);

    //query to find the country with the most customers
    @Query(value =  "SELECT MAX(COUNTRY) FROM CUSTOMER", nativeQuery = true)
    public String findCountryWithMostCustomers();
}

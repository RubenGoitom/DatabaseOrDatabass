package com.work.chinoog.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerSpender extends JpaRepository<Customer, Integer>  {
    // This query selects the customer who has spent the most money on invoices.
    //The return type is a single Customer object, the one that has spent the most on invoices public Customer getHighestSpenderCustomer();

    @Query(value =  "select * from customer c inner join invoice i  on i.customer_id = c.customer_id where i.total= (select max(total) from invoice)"
    , nativeQuery = true)
    public Customer getHighestSpenderCustomer();
}

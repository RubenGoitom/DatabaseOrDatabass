package com.work.chinoog.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerGenre extends JpaRepository<Customer, Integer> {
    // Creating a query that uses the native query language to select the most popular genre of a customer by joining multiple tables
    @Query(value = "select DISTINCT g.name from customer c inner join invoice i on i.customer_id = c.customer_id inner join invoice_line il on il.invoice_id = i.invoice_id inner join track t on t.track_id = il.track_id inner join genre g on g.genre_id = t.genre_id where g.name in (select max(name) from genre) and c.customer_id = #{id}",
    nativeQuery = true)
    // This method takes an input of customer id and returns the most popular genre of that customer
    public String findMostPopularGenreOfCustomer(@Param("id") int id);
}

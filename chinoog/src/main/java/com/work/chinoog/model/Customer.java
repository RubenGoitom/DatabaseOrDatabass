package com.work.chinoog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private String first_name;
    private String last_name;
    private String company;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postal_code;
    private String phone;
    private String fax;
    private String email;
    private Integer support_rep_id;
    private String name;
    
    public Integer getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getSupport_rep_id() {
        return support_rep_id;
    }
    public void setSupport_rep_id(Integer support_rep_id) {
        this.support_rep_id = support_rep_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
                + ", company=" + company + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
                + country + ", postal_code=" + postal_code + ", phone=" + phone + ", fax=" + fax + ", email=" + email
                + ", support_rep_id=" + support_rep_id + ", name=" + name + "]";
    }        
}

package baitap.service;

import baitap.entitty.Customer;

import java.util.List;

public interface CustomerService {
    void save (Customer customer);
    List<Customer> display();
}

package baitap.repository;

import baitap.entitty.Customer;

import java.util.List;

public interface CustomerRepository {
    void save (Customer customer);
    List<Customer> display();
}

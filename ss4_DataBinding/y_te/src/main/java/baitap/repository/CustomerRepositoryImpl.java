package baitap.repository;

import baitap.entitty.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();
    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> display() {
        return customerList;
    }
}

package baitap.service;

import baitap.entitty.Customer;
import baitap.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> display() {
        return customerRepository.display();
    }
}

package com.yg.SpringDataRest.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer>getAllCustomers()
    {
        return customerRepo.findAll();

    }

    public void save(Customer customer)
    {
        customerRepo.save(customer);
    }

    public Customer getById(Long id)
    {
        return customerRepo.findById(id).get();
    }

    public void deleteById(Long id)
    {
        customerRepo.deleteById(id);
    }

}

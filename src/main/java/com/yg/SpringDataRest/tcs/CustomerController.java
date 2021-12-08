package com.yg.SpringDataRest.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @CrossOrigin
    @PostMapping("/1234registerCustomer")
    public void registerCustomer(@RequestBody Customer customer)
    {
        customerService.save(customer);
        System.out.println("Customer with ssnid: "+customer.getSsnId()+" is registered successfully");


    }

    @CrossOrigin
    @GetMapping("/1234viewAllCustomers")
    public List<Customer> viewAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @CrossOrigin
    @GetMapping("/1234viewCustomerById/{id}")
    public ResponseEntity<Customer>viewCustomerById(@PathVariable Long id)
    {
        try{
            Customer customer=customerService.getById(id);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @PutMapping("/1234updateCustomer")
    public ResponseEntity<?>updateCustomer(@RequestBody Customer customer)
    {
        try{
            Customer existCustomer=customerService.getById(customer.getCustomerId());
            customerService.save(customer);
            System.out.println("Customer with id: "+customer.getCustomerId()+" updated successfully");
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (NoSuchElementException e)
        {
            System.out.println("Customer updation failed for id: "+customer.getCustomerId()+" and ssn: "+customer.getSsnId());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @DeleteMapping("/1234deleteCustomer/{id}")
    public void deleteCustomer (@PathVariable Long id)
    {
        try{
            Customer existCustomer=customerService.getById(id);
            customerService.deleteById(id);
            System.out.println("Customer with id: "+id+" deleted successfully");

        }
        catch (NoSuchElementException e)
        {
            System.out.println("No customer exists with id: "+id+" for deletion");

        }
    }
}

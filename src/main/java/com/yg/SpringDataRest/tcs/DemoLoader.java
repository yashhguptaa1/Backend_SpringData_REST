package com.yg.SpringDataRest.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final CustomerRepo repository;

    @Autowired
    public DemoLoader(CustomerRepo customerRepo){
        this.repository=customerRepo;
    }
    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Customer(1L,"23","yash",24,"a6","delhi","delhi"));
    }
}

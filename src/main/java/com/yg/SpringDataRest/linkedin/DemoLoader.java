//Vid 2.4 : Define Example Data

package com.yg.SpringDataRest.linkedin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {

    private final ContactRepository repository;

    @Autowired
    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Emmanuel", "Henri", "me@me.com"));
    }
}

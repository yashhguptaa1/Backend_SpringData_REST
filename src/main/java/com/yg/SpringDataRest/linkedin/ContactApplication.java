//Vid 3.1 : Finalize Base Server
//this line connects all files in model folder together

package com.yg.SpringDataRest.linkedin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactApplication.class, args);
    }

}
/*

 We need to finalize our API endpoints as we'll need to use it for
 both the front end and the back end.
 So let's change this and our main function to run our REST API.
 So the first thing we're going to do is create a new file.
 And we're going to do this in the model folder again.
 So basically this file will allow us to run the server.
 So when we first run our server,
 it's going to call this main function here that will run the server.
 */
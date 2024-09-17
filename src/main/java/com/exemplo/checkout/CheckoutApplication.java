package com.exemplo.checkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration;

@SpringBootApplication(exclude = {CouchbaseAutoConfiguration.class})
public class CheckoutApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(CheckoutApplication.class, args);
    }
}

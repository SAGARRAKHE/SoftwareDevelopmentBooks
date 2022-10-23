package com.example.ebookstore;

import com.example.ebookstore.controller.CheckoutController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EBookStoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(EBookStoreApplication.class, args);
    }

}

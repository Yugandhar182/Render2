package com.javawhizz.App.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CustomerController {
    // Existing code for the list of customers

    @GetMapping
    public String findAllCustomers() {
        return "Hello";
    }
}

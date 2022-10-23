package com.example.ebookstore.service;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CheckoutService {
    public double getInvoice(@RequestBody List<Integer> quantities);
}

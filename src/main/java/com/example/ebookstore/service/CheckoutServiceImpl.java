package com.example.ebookstore.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public double getInvoice(List<Integer> quantities) {

        //Implement logic to calculate Invoice
        return 1;
    }
}

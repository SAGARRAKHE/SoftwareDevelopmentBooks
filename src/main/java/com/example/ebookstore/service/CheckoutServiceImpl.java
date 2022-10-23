package com.example.ebookstore.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public double getInvoice(/*List<Integer> quantities*/ String quantities) {

        //Implement logic to calculate Invoice
        System.out.println("quantities" + quantities);
        return 1;
    }
}

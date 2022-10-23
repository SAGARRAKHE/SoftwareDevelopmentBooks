package com.example.ebookstore.controller;

import com.example.ebookstore.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;
    @PostMapping("/eBookCart/getInvoice")
    public double getInvoice(@RequestBody List<Integer> quantities)
    {
        return checkoutService.getInvoice(quantities);
    }
}

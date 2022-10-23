package com.example.ebookstore.controller;

import com.example.ebookstore.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eBookCart")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;
        @PostMapping("/getInvoice")
    public double getInvoice(@RequestBody List<Integer> quantities)
    {
        return checkoutService.getInvoice(quantities);
    }
}

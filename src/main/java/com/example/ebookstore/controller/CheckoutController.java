package com.example.ebookstore.controller;

import com.example.ebookstore.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping(value = "/eBookCart")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;
        @PostMapping(value = "/getInvoice", consumes = MediaType.TEXT_PLAIN_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public double getInvoice(@RequestBody String quantities)  throws ParseException
    {
        return checkoutService.getInvoice(quantities);
    }
}

package com.example.ebookstore.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
public interface CheckoutService {
    public double getInvoice(@RequestBody  String quantities);
}

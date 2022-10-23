package com.example.ebookstore.service;

import com.example.ebookstore.constats.Constants;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public double getInvoice( String quantities ) {
       Double totalAmount = 0.0;
        //Implement logic to calculate Invoice
        String arrOfQuantity[] = quantities.split(",");
            if (arrOfQuantity.length == 1 && arrOfQuantity[0].equals("1"))
                return Constants.BOOK_PRICE;
            else if(arrOfQuantity.length == 1 && arrOfQuantity[0].equals("2"))
                return 2*Constants.BOOK_PRICE - Constants.BOOK_PRICE*5*2/100;
            else if(arrOfQuantity.length == 1 && arrOfQuantity[0].equals("3"))
                return 3*Constants.BOOK_PRICE - Constants.BOOK_PRICE*10*3/100;
            else if(arrOfQuantity.length == 1 && arrOfQuantity[0].equals("4"))
                return 4*Constants.BOOK_PRICE - Constants.BOOK_PRICE*20*4/100;
            else if(arrOfQuantity.length>1){
                for (String a : arrOfQuantity){
                    int quantity = Integer.parseInt(a);
                    if(quantity==1)
                        totalAmount = totalAmount+Constants.BOOK_PRICE;
                    else if(quantity==2)
                         totalAmount =totalAmount + 2*Constants.BOOK_PRICE - Constants.BOOK_PRICE*5*2/100;
                    else if(quantity==3)
                        totalAmount =totalAmount + 3*Constants.BOOK_PRICE - Constants.BOOK_PRICE*10*3/100;
                    else if(quantity==4)
                        totalAmount =totalAmount + 4*Constants.BOOK_PRICE - Constants.BOOK_PRICE*20*4/100;
                }
            }

        return totalAmount;
    }
}

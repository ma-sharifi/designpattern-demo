package com.example.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
@Data
@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    @Override
    public String pay(int amount) {
       return amount +" paid with credit/debit card";
    }

}

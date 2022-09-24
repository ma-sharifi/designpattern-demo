package com.example.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */

@Data
@AllArgsConstructor
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    @Override
    public String pay(int amount) {
        return amount + " paid using Paypal.";
    }

}

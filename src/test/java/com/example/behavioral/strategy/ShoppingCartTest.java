package com.example.behavioral.strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
class ShoppingCartTest {

    /**
     Notice that payment method of shopping cart requires payment algorithm as argument and doesn’t store it anywhere
     as instance variable. Let’s test our strategy pattern example setup with a simple program.
     */

    @Test
    void shouldPayBy() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1",10);
        Item item2 = new Item("2",20);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        Assertions.assertEquals(30 + " paid using Paypal.",cart.pay(new PaypalStrategy("mahdi.elu@example.com", "password")));
        //pay by credit card
        Assertions.assertEquals(30 + " paid with credit/debit card" ,cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15")));

    }
}
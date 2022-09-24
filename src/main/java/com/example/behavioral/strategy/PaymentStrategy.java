package com.example.behavioral.strategy;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
//https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
/**
 we will try to implement a simple Shopping Cart where we have two payment strategies - using Credit Card or using PayPal.
 First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument.
 */
public interface PaymentStrategy {
    String pay(int amount);
}
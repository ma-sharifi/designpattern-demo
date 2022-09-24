package com.example.behavioral.strategy;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
//https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
/**
 we will try to implement a simple Shopping Cart where we have two payment strategies - using Credit Card or using PayPal.
 First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument.

 PROS:
 * 	You can swap algorithms used inside an object at runtime.
 * 	You can isolate the implementation details of an algorithm from the code that uses it.
 * 	You can replace inheritance with composition.
 * 	Open/Closed Principle. You can introduce new strategies without having to change the context.

 CONS:
 * 	If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
 * 	Clients must be aware of the differences between strategies to be able to select a proper one.
 * 	A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.

 */
public interface PaymentStrategy {
    String pay(int amount);
}
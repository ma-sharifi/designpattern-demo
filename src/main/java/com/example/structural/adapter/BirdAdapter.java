package com.example.structural.adapter;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */

/**
 Suppose you have a Bird class with fly() , and makeSound()methods.
 And also a ToyDuck class with squeak() method.
 Let’s assume that you are short on ToyDuck objects and you would like to use Bird objects in their place.
 Birds have some similar functionality but implement a different interface, so we can’t use them directly.
 So we will use adapter pattern. Here our client would be ToyDuck and adaptee would be Bird.
 */
public class BirdAdapter implements ToyDuck{
    // You need to implement the interface your
    // client expects to use.
    Bird bird;
    public BirdAdapter(Bird bird)
    {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    public String squeak()
    {
        // translate the methods appropriately
        return bird.makeSound();
    }
}

package com.example.structural.adapter;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */

class Sparrow implements Bird
{
    // a concrete implementation of bird
    public String fly()
    {
        return "Flying";
    }
    public String makeSound()
    {
        return "Chirp Chirp";
    }
}
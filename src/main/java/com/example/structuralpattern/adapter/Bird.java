package com.example.structuralpattern.adapter;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
// Java implementation of Adapter pattern
//https://www.geeksforgeeks.org/adapter-pattern/
interface Bird
{
    // birds implement Bird interface that allows
    // them to fly and make sounds adaptee interface
     String fly();
    String makeSound();
}
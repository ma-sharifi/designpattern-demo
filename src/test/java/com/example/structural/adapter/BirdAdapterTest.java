package com.example.structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
class BirdAdapterTest {

    @Test
    void shouldAdaptBirdToToyDuck(){
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        System.out.println("Sparrow...");
        Assertions.assertEquals("Flying",sparrow.fly());
        Assertions.assertEquals("Chirp Chirp", sparrow.makeSound());

        System.out.println("ToyDuck...");
        Assertions.assertEquals("Squeak",  toyDuck.squeak());

        // Bird  behaving like a duck
        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("BirdAdapter...");
        Assertions.assertEquals("Chirp Chirp",birdAdapter.squeak());

        // toy duck behaving like a bird
//        Explanation :
//        Suppose we have a bird that can makeSound(), and we have a plastic toy duck that can squeak().
//        Now suppose our client changes the requirement and he wants the toyDuck to makeSound than ?
//        Simple solution is that we will just change the implementation class to the new adapter class and tell
//        the client to pass the instance of the bird(which wants to squeak()) to that class.
//        Before : ToyDuck toyDuck = new PlasticToyDuck();
//        After : ToyDuck toyDuck = new BirdAdapter(sparrow);
//        You can see that by changing just one line the toyDuck can now do Chirp Chirp !!

        Bird duckAdapter = new PlasticToyDuckAdapter(toyDuck);
        System.out.println("DuckAdapter...");
        Assertions.assertEquals("Squeak",duckAdapter.makeSound());
    }
}

package com.example.structural.adapter;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
//Suppose we have a bird that can makeSound(), and we have a plastic toy duck that can squeak().
// Now suppose our client changes the requirement and he wants the toyDuck to makeSound than ?
public class PlasticToyDuckAdapter implements Bird{

    private ToyDuck toyDuck;

    public PlasticToyDuckAdapter(ToyDuck toyDuck){
        this.toyDuck=toyDuck;
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String makeSound() {
        return toyDuck.squeak();
    }
}

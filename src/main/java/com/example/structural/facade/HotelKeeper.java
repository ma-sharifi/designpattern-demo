package com.example.structural.facade;

/**
 * @author Mahdi Sharifi
 * @since 9/23/22
 */
//https://www.geeksforgeeks.org/facade-design-pattern-introduction/

/**
 Pros:
 You can isolate your code from the complexity of a subsystem.
 Cons:
 A facade can become a god object coupled to all classes of an app.
 */
public class HotelKeeper {
    public VegMenu getVegMenu() {
        Hotel v = new VegRestaurant();
        return (VegMenu) v.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        Hotel v = new NonVegRestaurant();
        return (NonVegMenu) v.getMenus();
    }

    public MeetMenu getMeetMenu() {
        Hotel v = new MeetRestaurant();
        return (MeetMenu) v.getMenus();
    }
}

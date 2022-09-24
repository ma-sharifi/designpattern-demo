package com.example.structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mahdi Sharifi
 * @since 9/23/22
 */
class HotelKeeperFacadeTest {

    @Test
    void test(){
        HotelKeeper keeper = new HotelKeeper();

        VegMenu veg = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        MeetMenu meetMenu= keeper.getMeetMenu();

        Assertions.assertTrue(veg instanceof VegMenu);
        Assertions.assertTrue(nv instanceof NonVegMenu);
        Assertions.assertTrue(meetMenu instanceof MeetMenu);

    }
}

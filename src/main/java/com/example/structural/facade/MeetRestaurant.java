package com.example.structural.facade;

/**
 * @author Mahdi Sharifi
 * @since 9/23/22
 */
public class MeetRestaurant implements Hotel {
    public Menus getMenus()
    {
    return new MeetMenu();
    }
}
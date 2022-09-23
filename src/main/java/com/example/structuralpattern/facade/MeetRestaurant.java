package com.example.structuralpattern.facade;

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
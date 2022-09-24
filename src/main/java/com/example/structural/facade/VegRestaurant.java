package com.example.structural.facade;

/**
 * @author Mahdi Sharifi
 * @since 9/23/22
 */
public class VegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        VegMenu v = new VegMenu();
        return v;
    }
}
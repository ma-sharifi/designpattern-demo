package com.example.structuralpattern.facade;

/**
 * @author Mahdi Sharifi
 * @since 9/23/22
 */
public class NonVegRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}

package com.company;

public class DeluxeBurger extends Hamburger{
    private String burgerName = "Deluxe Burger";
    private double hamburgerPrice = 5.25;

    public DeluxeBurger(String meat) {
        super("deluxe bread", meat, false, false, false, false, false, false, true, true);
    }

    public void ringUp(){
        totalPrice(burgerName, hamburgerPrice);
    }

}

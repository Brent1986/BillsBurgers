package com.company;

public class BasicBurger extends Hamburger{
    private String burgerName = "Basic Burger";
    private double hamburgerPrice = 4.99;

    public BasicBurger(String bread, String meat, boolean tomato,
                       boolean egg, boolean avocado, boolean onion) {
        super(bread, meat, tomato, egg, avocado, onion, false, false, false, false);
    }

    public void ringUp(){
        totalPrice(burgerName, hamburgerPrice);
    }

}

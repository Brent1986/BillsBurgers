package com.company;

public class HealthyBurger extends Hamburger {
    private String burgerName = "Healthy Burger";
    private double hamburgerPrice = 6.49;

    public HealthyBurger(String meat, boolean tomato,
                       boolean egg, boolean avocado, boolean onion, boolean kale, boolean carrot) {
        super("Brown Rye Bread", meat, tomato, egg, avocado, onion, kale, carrot, false, false);
    }

    public void ringUp(){
        totalPrice(burgerName, hamburgerPrice);
    }
}

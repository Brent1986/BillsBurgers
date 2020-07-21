package com.company;

public class Hamburger {
    final double foodTax = .0625; // prepared food tax *

    private String bread;
    private String meat;
    private boolean tomato;
    private boolean egg;
    private boolean avocado;
    private boolean onion;
    private boolean kale; // healthy burger only *
    private boolean carrot; // healthy burger only *
    private boolean chips; // deluxe selection only *
    private boolean drink; // deluxe selection only *
    private double kalePrice = .70;
    private double carrotPrice = .30;
    private double tomatoPrice = .30;
    private double eggPrice = 1.00;
    private double onionPrice = .30;
    private double avocadoPrice = 1.69;
    private double chipsPrice = 1.99;
    private double drinkPrice = 2.10;

    public Hamburger(String bread, String meat, boolean tomato, boolean egg,
                     boolean avocado, boolean onion, boolean kale, boolean carrot, boolean chips, boolean drink) {
        this.bread = bread;
        this.meat = meat;
        this.tomato = tomato;
        this.egg = egg;
        this.avocado = avocado;
        this.onion = onion;
        this.kale = kale;
        this.carrot = carrot;
        this.chips = chips;
        this.drink = drink;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public double getAvocadoPrice() {
        return avocadoPrice;
    }

    public double getKalePrice() {
        return kalePrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public boolean isDrink() {
        return drink;
    }

    public void totalPrice(String burgerName, double hamburgerPrice){
        double priceTotal = hamburgerPrice;
        System.out.println(burgerName + " (" + this.bread + "," + this.meat + ") = $" + hamburgerPrice);
        if (tomato){
            System.out.println("Tomato = $" + getTomatoPrice());
            priceTotal += getTomatoPrice();
        }
        if (egg){
            System.out.println("Egg = $" + getEggPrice());
            priceTotal += getEggPrice();
        }
        if (avocado){
            System.out.println("Avocado = $" + getAvocadoPrice());
            priceTotal += getAvocadoPrice();
        }
        if (onion){
            System.out.println("Onion = $" + getOnionPrice());
            priceTotal += getOnionPrice();
        }
        if (kale){
            System.out.println("Kale = $" + getKalePrice());
            priceTotal += getKalePrice();
        }
        if (carrot){
            System.out.println("Carrot = $" + getCarrotPrice());
            priceTotal += getCarrotPrice();
        }
        if (chips){
            System.out.println("Chips = $" + getChipsPrice());
            priceTotal += getChipsPrice();
        }
        if (drink){
            System.out.println("Drink = $" + getDrinkPrice());
            priceTotal += getDrinkPrice();
        }
        System.out.println("====================");
        System.out.println("Food cost = $" + priceTotal);
        System.out.println("Prepared foods tax = $" + (priceTotal*foodTax));
        System.out.println("Total cost = $" + (priceTotal+(priceTotal*foodTax)));
    }

}

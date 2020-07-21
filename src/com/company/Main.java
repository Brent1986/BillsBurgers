package com.company;

public class Main {

    public static void main(String[] args) {
        //BasicBurger custOneOrder = new BasicBurger("hard roll","medium rare",true,false,true,false);
        //custOneOrder.ringUp();

        //HealthyBurger custTwoOrder = new HealthyBurger("rare",false,true,true,false,true,false);
        //custTwoOrder.ringUp();

        DeluxeBurger custThreeOrder = new DeluxeBurger("mid rare");
        custThreeOrder.ringUp();
    }
}

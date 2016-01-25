package com.example;

public class Demo {
    public static void main(String[] args) {

    Player tim = new Player("Tom Smith, 6");

        System.out.println(tim.getHandleName());
        System.out.println(tim.getLevel());
        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("Gold Shiny Axe",15,50);
        tim.setWeapon(myAxe);
        System.out.println(tim.getWeapon().getName());
//        System.out.println(tim.handleName);
//        tim.handleName = "Tim";
//        System.out.println(tim.handleName);
//        System.out.println(tim.getHandleName());
//
//        tim.setHandleName("Timmy");
//
//        System.out.println(tim.getHandleName());
//
//        Player louise = new Player("Louise");
//        System.out.println(louise.getHandleName());
//
//        louise.setLevel(5);
//        System.out.println(louise.getLevel());
    }
}

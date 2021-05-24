package com.company;

public class Helmet extends Equipment {
    @Override
    String getName(){
        return "Epicki hełm";
    }
    @Override
    int HP() {
        return 15;
    }

    @Override
    int Demage() {
        return 5;
    }

    @Override
    int Armor() {
        return 5;
    }
}
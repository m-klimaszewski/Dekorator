package com.company;

public class Sword extends Equipment {
    @Override
    String getName(){
        return "Legendarny miecz";
    }
    @Override
    int HP() {
        return 25;
    }

    @Override
    int Demage() {
        return 10;
    }

    @Override
    int Armor() {
        return 10;
    }
}
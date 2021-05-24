package com.company;

public class Trousers extends Equipment {
    @Override
    String getName(){
        return "Spodnie";
    }
    @Override
    int HP() {
        return 5;
    }

    @Override
    int Demage() {
        return 3;
    }

    @Override
    int Armor() {
        return 2;
    }
}
package com.company;

public class Gloves extends Equipment {
    @Override
    String getName(){
        return "Rzadkie rękawice";
    }
    @Override
    int HP() {
        return 10;
    }

    @Override
    int Demage() {
        return 3;
    }

    @Override
    int Armor() {
        return 4;
    }

}

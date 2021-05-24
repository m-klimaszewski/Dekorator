package com.company;

public class Boots extends Equipment {
   @Override
   String getName(){
       return  "Pospolite buty";
   }
    @Override
    int HP() {
        return 3;
    }

    @Override
    int Demage() {
        return 1;
    }

    @Override
    int Armor() {
        return 2;
    }

}

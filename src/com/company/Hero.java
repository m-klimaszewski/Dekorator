package com.company;

import javax.print.attribute.HashPrintJobAttributeSet;

public abstract class Hero {
    private static int HP = 100;
    private static int demage = 10;
    private static int armor = 10;
    boolean gloves, helemet, boots, sword, trousers = false;

   String getHero(){
       return "Twój Bohater:\n Hp: "+HP
               + "\nAtak: " + demage
               +"\nArmor: " + armor;
   }

    static void add_equipment(Equipment equipment) {

        HP += equipment.HP();
        demage += equipment.Demage();
        armor += equipment.Armor();
        System.out.println("Dodano: " + equipment.getName() );

    }
   static void remove_equipment(Equipment equipment) {
        HP -= equipment.HP();
        demage -= equipment.Demage();
        armor -= equipment.Armor();
       System.out.println("Usunięto: " + equipment.getName() );
    }


}

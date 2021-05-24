package com.company;

import java.util.Scanner;

public class Application extends Hero {
    void Show_menu() {
        System.out.println("Witaj w symulacji bohatera");
        System.out.println("1. Aby stworzyć nowego bohatera naciśnij \"1\".\n" +
                "\n" +
                "2. W celu dodania/usunięcia rękawic do/z aktualnego bohatera naciśnij \"2\".\n" +
                "\n" +
                "3. W celu dodania/usunięcia butów do/z aktualnego bohatera naciśnij \"3\".\n" +
                "\n" +
                "4. W celu dodania/usunięcia spodni do/z aktualnego bohatera naciśnij \"4\".\n" +
                "\n" +
                "5. W celu dodania/usunięcia hełmu do/z aktualnego bohatera naciśnij \"5\".\n" +
                "\n" +
                "6. W celu dodania/usunięcia miecza do/z aktualnego bohatera naciśnij \"6\".\n" +
                "\n" +
                "7. Aby zatrzymać działanie programu naciśnij \"0\".");
    }

    void menu() {

        Show_menu();
        Scanner in = new Scanner(System.in);
        int choice;
        boolean heroIsExist = false;

        while ((choice = in.nextInt()) != 0) {

            if (choice == 1) {
                System.out.println(getHero());
                heroIsExist = true;
            }
            if (choice == 2) {
                if (heroIsExist) {
                    if (gloves) {
                        Equipment equipment = new Gloves();
                        Hero.remove_equipment(equipment);
                        System.out.println(getHero());
                        gloves = false;
                    } else {
                        Equipment equipment = new Gloves();
                        Hero.add_equipment(equipment);
                        System.out.println(getHero());
                        gloves = true;
                    }

                } else {
                    System.out.println("Stwórz bohatera");
                }


            }
            if (choice == 3) {
                if (heroIsExist) {
                    if (boots) {
                        Equipment equipment = new Boots();
                        Hero.remove_equipment(equipment);
                        System.out.println(getHero());
                        boots = false;
                    } else {
                        Equipment equipment = new Boots();
                        Hero.add_equipment(equipment);
                        System.out.println(getHero());
                        boots = true;
                    }

                } else {
                    System.out.println("Stwórz bohatera");
                }


            }
            if (choice == 4) {
                if (heroIsExist) {
                    if (helemet) {
                        Equipment equipment = new Helmet();
                        Hero.remove_equipment(equipment);
                        System.out.println(getHero());
                        helemet = false;
                    } else {
                        Equipment equipment = new Helmet();
                        Hero.add_equipment(equipment);
                        System.out.println(getHero());
                        helemet = true;
                    }

                } else {
                    System.out.println("Stwórz bohatera");
                }


            }
            if (choice == 5) {
                if (heroIsExist) {
                    if (trousers) {
                        Equipment equipment = new Trousers();
                        Hero.remove_equipment(equipment);
                        System.out.println(getHero());
                        trousers = false;
                    } else {
                        Equipment equipment = new Trousers();
                        Hero.add_equipment(equipment);
                        System.out.println(getHero());
                        trousers = true;
                    }

                } else {
                    System.out.println("Stwórz bohatera");
                }


            }
            if (choice == 6) {
                if (heroIsExist) {
                    if (sword) {
                        Equipment equipment = new Sword();
                        Hero.remove_equipment(equipment);
                        System.out.println(getHero());
                        sword = false;
                    } else {
                        Equipment equipment = new Sword();
                        Hero.add_equipment(equipment);
                        System.out.println(getHero());
                        sword = true;
                    }

                } else {
                    System.out.println("Stwórz bohatera");
                }


            }
            System.out.println("Wciśnij 1 aby kontynuować...");
            int stop = in.nextInt();

                Show_menu();

        }


    }
}

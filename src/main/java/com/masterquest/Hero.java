package com.masterquest;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int health;
    ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    ArrayList<Key> keys = new ArrayList<Key>();

    public Hero(String name) {
        this.name = name;
        this.health = 100;
    }

    public void printHeroInfo() {
        System.out.println("You are " + name + " the might hero!");
    }

    public void printHeroHealth() {
        System.out.println("Your current health is: " + health);
    }


    public void addHeroWeapon(Weapon theWeapon) {
        weapons.add(theWeapon);
    }

    public void printAllHeroWeapons() {
        for (Weapon theWeapon : weapons) {
            theWeapon.printWeaponInfo();
        }
    }
    

}

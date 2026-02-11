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
        System.out.println("Your current weapons are: ");
        for (Weapon theWeapon : weapons) {
            theWeapon.printWeaponInfo();
        }
    }

    public void swingWeapon(Weapon theWeapon) {
        theWeapon.doDamage();
    }


    public void addKey (Key theKey) {
        keys.add(theKey);
    }

    public void printAllKeys() {
        if (keys.isEmpty()) {
            System.out.println("You currently have no keys");
        } else {
            System.out.println("You currently have the following keys:");
            for (Key theKey : keys) {
                theKey.printKeyInfo();
            }
        }
    }

    public void heroAttack() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("What weapon will you use against the enemy, hero?");
        printAllHeroWeapons();
        
        
    }
        
    

}

package com.masterquest;

import java.util.ArrayList;
import java.util.Scanner;

public class Hero {
    private String name;
    protected int health;
    ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    ArrayList<Key> keys = new ArrayList<Key>();

    Scanner r = new Scanner(System.in);

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


    public void enemyDamage(Enemy theEnemy, Weapon theWeapon) {
        int totalDamage = theWeapon.doDamage();
        theEnemy.health -= totalDamage;
        System.out.println("The " + theEnemy.name + " takes " + totalDamage + " damage!");
        System.out.println("The " + theEnemy.name + " has " + theEnemy.health + " health left!");
    }

    public void heroAttack() {
        int attacks = 0;
        while (true) { 
            if (this.health > 0) {
                switch (attacks) {
                case 0:
                    System.out.println("- - - - - - - - - - - - - - -");
                    System.out.println("- - - - - - - - - - - - - - -");
                    System.out.println("What weapon will you use against the enemy, hero?");
                    printAllHeroWeapons();
                    String weaponName = r.nextLine();
                    String weaponNameLow = weaponName.toLowerCase();

                    for (Weapon theWeapon : weapons) {
                        if (theWeapon.printWeaponId().equals(weaponNameLow)) {
                            swingWeapon(theWeapon);
                             
                        }
                    }

            }

            }
            
        }
        

        
        
    }
        
    


}

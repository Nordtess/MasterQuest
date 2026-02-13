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

    public void nextTurn() {
        System.out.println("Enter 'r' for the next turn");
        while (true) {
            String turn = r.nextLine().toLowerCase();
            boolean ready = true;
            if (turn.toLowerCase().equals("r")) {
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("- - - - - - - - - - - - - - -");
                ready = false;
                break;
            } else {
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("Please enter 'r' when ready champion");
            }
        }
        
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


    public void heroDamage(Enemy theEnemy, String theWeapon) {
        int totalDamage;
        boolean ready = true;
        while (ready) {
            printAllHeroWeapons();
            String choosenWeapon = r.nextLine();
            String choosenWeaponLowerCase = choosenWeapon.toLowerCase();
            boolean weaponFound = false;
            
            for (Weapon wep : weapons) {
                if (choosenWeaponLowerCase.equals(wep.printWeaponId().toLowerCase())) {
                    totalDamage = wep.doDamage();
                    theEnemy.health -= totalDamage;
                    System.out.println("- - - - - - - - - - - - - - -");
                    System.out.println("- - - - - - - - - - - - - - -");
                    System.out.println(theEnemy.name + " takes " + totalDamage + " damage!");
                    System.out.println(theEnemy.name + " has " + theEnemy.health + " health left!");
                    weaponFound = true;
                    ready = false;
                    break;
                }
            }
            
            if (!weaponFound) {
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("You don't have such a weapon champion!");
            }

            if (theEnemy.health == 0) {
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("You strike resolut, " + theEnemy.name + " falls to the groud and is defeated!");
            }
        }
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

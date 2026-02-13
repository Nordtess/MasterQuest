package com.masterquest;

import java.util.Random;

public class Weapon {

    private String id;
    private int lowestDamage;
    private int highestDamage;
    Random rand = new Random();

    public Weapon(String id, int lowestDamage, int highestDamage) {
        this.id = id;
        this.lowestDamage = lowestDamage;
        this.highestDamage = highestDamage;
    }

    public void printWeaponInfo() {
        System.out.println(id + " with damage " + lowestDamage + " - " + highestDamage);
    }

    public int doDamage() {
        int low = lowestDamage;
        int high = highestDamage;
        int result = rand.nextInt(high-low) + low;
        return result;
    }

    public String printWeaponId () {
        return this.id;
    }



}

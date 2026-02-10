package com.masterquest;

public class Weapon {

    private String id;
    private int lowestDamage;
    private int highestDamage;

    public Weapon(String id, int lowestDamage, int highestDamage) {
        this.id = id;
        this.lowestDamage = lowestDamage;
        this.highestDamage = highestDamage;
    }

    public void printWeaponInfo() {
        System.out.println("You are wielding " + id + " with damage " + lowestDamage + " - " + highestDamage);
    }

}

package com.masterquest;

public class Enemy {

    protected String name;
    protected int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void enemyDamage(Hero theHero, Weapon theWeapon) {
        int totalDamage = theWeapon.doDamage();
        theHero.health -= totalDamage;
        
        if (theHero.health >= 1) {
            System.out.println(this.name + " does " + totalDamage + " to you!");
            System.out.println("You have" + theHero.health + " health left! Be carefull!");
        } else if (theHero.health == 0) {
            System.out.println(this.name + " does " + totalDamage + " to you!");
            System.out.println("My champion your life force is fading away, your health is " + theHero.health);
            System.out.println("Humanity is doomed!");
        }
    }
}

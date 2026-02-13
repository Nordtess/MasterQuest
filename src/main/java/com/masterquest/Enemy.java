package com.masterquest;

public class Enemy {

    protected String name;
    protected int health;
    protected Weapon theWeapon;

    

    public Enemy(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.theWeapon = weapon;
    }

    public void enemyDamage(Hero theHero, Weapon theWeapon) {
        int totalDamage = theWeapon.doDamage();
        theHero.health -= totalDamage;
        
        if (theHero.health >= 1) {
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println(this.name + " does " + totalDamage + " to you!");
            System.out.println("You have " + theHero.health + " health left! Be careful!");
        } else if (theHero.health == 0) {
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println(this.name + " does " + totalDamage + " to you!");
            System.out.println("My champion your life force is fading away, your health is " + theHero.health);
            System.out.println("Humanity is doomed!");
        }
    }

    // Overloaded method for enemies with predetermined weapons
    public void enemyDamage(Hero theHero) {
        enemyDamage(theHero, this.theWeapon);
    }
}

package com.masterquest;

public class Firedemon extends Enemy {

    public Firedemon (String name, int health) {
        super(name, health, new Weapon("Fire sword", 40, 60));
    }
    
}

package com.masterquest;

public class FinalBoss extends Enemy {

    public FinalBoss(String name, int health) {
        super(name, health, new Weapon("Axe of thousand souls", 70, 100));
    }
    
}

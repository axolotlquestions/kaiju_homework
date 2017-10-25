package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public class APC extends Vehicle {

    public APC(String type, int healthValue, int attackValue) {
        super(type, healthValue);
    }

    public String strongAttack(Kaiju monster) {
        monster.damage(10);
        return "Blam!";
    }

    public String weakAttack(Kaiju monster) {
        monster.damage(5);
        return "pew pew!";
    }
}

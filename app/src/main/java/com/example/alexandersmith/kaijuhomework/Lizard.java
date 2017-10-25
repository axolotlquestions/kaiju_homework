package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public class Lizard extends Kaiju {

    public Lizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String attack(Vehicle vehicle){
        vehicle.damage(getAttackValue());
        return "Breathe nuclear fire";
    }

    public String move(){
        return "stomps down the street";
    }
}



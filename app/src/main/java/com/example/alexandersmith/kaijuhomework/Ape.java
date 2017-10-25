package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public class Ape extends Kaiju {

    public Ape(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String attack(Vehicle vehicle){
        vehicle.damage(getAttackValue());
        return "Smash with fists";
    }

    public String move(){
        return "climbs skyscraper";
    }


}

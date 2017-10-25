package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public abstract class Vehicle {
    private String type;
    private int healthValue;


    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }


    public String damage(int damage) {
        this.healthValue -= damage;
        if (healthValue > 0) {
            return "Still in the fight";
        }
        return "Kaboom";
    }


}
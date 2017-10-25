package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public abstract class Kaiju {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String roar(){
        return "Roar!";
    }

    public String damage(int damage){
        this.healthValue -=damage;
        if (healthValue > 0){
            return "Bloodied but not out";
        }
        return "It was beauty killed the beast";
    }
}

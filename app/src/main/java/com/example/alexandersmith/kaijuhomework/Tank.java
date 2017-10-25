package com.example.alexandersmith.kaijuhomework;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public class Tank extends Vehicle {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue);
    }

    public String strongAttack(Kaiju kaiju) {
        kaiju.damage(20);
        return "Blam!";
    }

    public String weakAttack(Kaiju kaiju) {
        kaiju.damage(10);
        return "pew pew!";
    }

    public void pickAttack(String type, Kaiju kaiju) {
        if (type == "Strong") {
            strongAttack(kaiju);
        } else if (type == "Weak"){
            weakAttack(kaiju);
        }
        }

}
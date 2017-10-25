package com.example.alexandersmith.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 25/10/2017.
 */

public class KaijuTest {

    Lizard lizard;
    Ape ape;
    Tank tank;
    APC APC;

    @Before
    public void before() {
        lizard = new Lizard("Godzilla", 100, 50);
        ape = new Ape("King Kong", 100, 25);
        tank = new Tank("heavy", 50, 20);
        APC = new APC("light", 25, 10);
    }

    @Test
    public void testLizardHasName(){
        assertEquals("Godzilla", lizard.getName());
    }

    @Test
    public void testApeHasName(){
        assertEquals("King Kong", ape.getName());
    }

    @Test
    public void testLizardHasHealth(){
        assertEquals(100, lizard.getHealthValue());
    }

    @Test
    public void testApeHasHealth(){
        assertEquals(100, ape.getHealthValue());
    }

    @Test
    public void testApeMove(){
        assertEquals("climbs skyscraper", ape.move());
    }

    @Test
    public void testLizardMove(){
        assertEquals("stomps down the street", lizard.move());
    }

    @Test
    public void testLizardCanRoar(){
        assertEquals("Roar!", lizard.roar());
    }

    @Test
    public void testTankhashealth(){
        assertEquals(50, tank.getHealthValue());
    }

    @Test
    public void testTankDestroyed(){
        assertEquals("Kaboom", tank.damage(50));
    }

    @Test
    public void testTankFightsOn(){
        assertEquals("Still in the fight", tank.damage(25));
    }

    @Test
    public void testTankHasStrongAttack(){
        assertEquals("Blam!", tank.strongAttack(lizard));
        assertEquals(80, lizard.getHealthValue());
    }

    @Test
    public void testKaijuCanAttackTank(){
        assertEquals("Breathe nuclear fire", lizard.attack(tank));
        assertEquals(0, tank.getHealthValue());
    }

    @Test
    public void testKaijudies(){
        assertEquals("It was beauty killed the beast", ape.damage(100));
    }

    @Test
    public void testKaijuFightsOn(){
        assertEquals("Bloodied but not out", ape.damage(50));
    }

    @Test
    public void testAttackPicker(){
       tank.pickAttack("Strong", lizard);
        assertEquals(80, lizard.getHealthValue());
    }

}

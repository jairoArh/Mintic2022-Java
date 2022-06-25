package edu.udea.cars.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car renault;
    private Car chevrolet;

    void setup(){
        renault = new Car("JIA764","Renault 4",(short)1977);
        chevrolet = new Car("NOT560","Chevrolet Aveo",(short)2007);
    }

    @Test
    void start() {
        setup();
        assertTrue( renault.start());
        assertTrue( chevrolet.start());
    }

    @Test
    void shutdown() {
        setup();
        assertFalse(renault.shutdown());
        assertFalse(chevrolet.shutdown());
    }

    @Test
    void speedUp() {
        setup();
        assertEquals(0,renault.getSpeed());
        assertEquals(80,renault.speedUp((short)80));
        assertEquals(200,renault.speedUp((short)120));
        assertEquals(0,chevrolet.getSpeed());
        assertEquals(120,chevrolet.speedUp((short)120));
        assertEquals(150,chevrolet.speedUp((short)30));

        assertEquals(200,renault.getSpeed());
        assertEquals(150,chevrolet.getSpeed());
    }

    @Test
    void breaking() {
        setup();
    }
}
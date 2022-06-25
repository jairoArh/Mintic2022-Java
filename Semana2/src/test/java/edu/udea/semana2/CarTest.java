/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.udea.semana2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jairoarmando
 */
public class CarTest {
    
    private Car renault;
    private Car chevrolet;
    
    private void setup(){
        renault = new Car("JIA764","Renault 4",(short)1977);
        chevrolet = new Car("NOT560","Chevrolet Aveo",(short)2007);
    }
    
    @Test
    void testStart(){
        setup();
        assertTrue(renault.start());
        assertTrue(chevrolet.start());
    }
    
    @Test
    void testShutdown(){
        setup();
        assertFalse( renault.shutdown());
        assertFalse( chevrolet.shutdown());
    }
    
    @Test
    void testSpeedUp(){
        setup();
    }
    
    @Test
    void testBreaking(){
        setup();
    }
    
}

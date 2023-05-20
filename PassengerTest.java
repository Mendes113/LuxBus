package com.resolucaoproblemas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Image; 


import org.junit.jupiter.api.Test;



public class PassengerTest {
    
    public PassengerTest() {
    }
    
   
    

   
    @Test

   
    public void testGetLocation() {
       
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        Location expResult = new Location(3,4);
        assertEquals(expResult, instance.getLocation());
      
    }
    @Test

   
    public void testSadGetLocation() {
       
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        Location expResult = new Location(3,2);
        assertNotEquals(expResult, instance.getLocation());
      
    }

    @Test
    public void testGetPickupLocation() {
    
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        //Location resultadoEsperado = new Location(3,4);
        Location expResult = new Location(3,4);
        assertEquals(expResult, instance.getPickupLocation());
        
    }
    @Test
    public void testSadGetPickupLocation() {
    
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        //Location resultadoEsperado = new Location(3,4);
        Location expResult = new Location(3,2);
        assertNotEquals(expResult, instance.getPickupLocation());
        
    }
    @Test
    public void testgetDestinationLocation() {
    
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        //Location resultadoEsperado = new Location(3,4);
        Location expResult = new Location(3,4);
        assertEquals(expResult, instance.getDestination());
        
    }
    @Test
    public void testSadGetDestinationLocation() {
    
        Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
        //Location resultadoEsperado = new Location(3,4);
        Location expResult = new Location(3,2);
        assertNotEquals(expResult, instance.getDestination());
        
    }
    @Test
    public void testtoString() {
        
            Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
            //Location resultadoEsperado = new Location(3,4);
            String expResult = "Passenger travelling from " + new Location(3,4) + " to " + new Location(3,4);
            assertEquals(expResult, instance.toString());
            
    }
    @Test
    public void testSadtoString() {
        
            Passenger instance = new Passenger(new Location(3,4), new Location(3,4));
            //Location resultadoEsperado = new Location(3,4);
            String expResult = "Passenger travelling  " + new Location(3,4) + " to " + new Location(3,4);
            assertNotEquals(expResult, instance.toString());
            
    }
    



   
   

   
   
    
    
    
}

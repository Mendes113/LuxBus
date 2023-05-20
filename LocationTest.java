package com.resolucaoproblemas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class LocationTest {
    @Test
    void testDistance() {
        Location location = new Location(0, 0);
        Location destination = new Location(3, 4);
        assertEquals(4, location.distance(destination));
    }
    @Test
    void testSadDistance() {
        Location location = new Location(0, 0);
        Location destination = new Location(3, 3);
        assertNotEquals(4, location.distance(destination));
    }

    @Test
    void testEquals() {
        Location location = new Location(3, 4);
        Location destination = new Location(3, 4);
        assertEquals(location, destination);
    }
    @Test
    void testSadEquals() {
        Location location = new Location(3, 4);
        Location destination = new Location(3, 2);
        assertNotEquals(location, destination);
    }

    @Test
    void testGetX() {
        Location location = new Location(2, 3);
        assertEquals(2, location.getX());
    }
    @Test
    void testSadGetX() {
        Location location = new Location(3, 2);
        assertNotEquals(2, location.getX());
    }

    @Test
    void testGetY() {
        Location location = new Location(2, 3);
        assertEquals(3, location.getY());
    }

    @Test
    void testSadGetY() {
        Location location = new Location(3, 2);
        assertNotEquals(3, location.getY());
    }

    @Test
    void testHashCode() {
        Location location = new Location(1, 2);
        assertEquals(131073, location.hashCode());
    }
    @Test
    void testSadHashCode() {
        Location location = new Location(1, 1);
        assertNotEquals(131073, location.hashCode());
    }
    @Test
    void testNextLocation() {
        Location location = new Location(0, 0);
        Location destination = new Location(3, 4);
        Location nextLocation = location.nextLocation(destination);
        assertEquals(new Location(1, 1), nextLocation);
    }
    @Test
    void testSadNextLocation() {
        Location location = new Location(0, 0);
        Location destination = new Location(0, 0);
        Location nextLocation = location.nextLocation(destination);
        assertNotEquals(new Location(1, 1), nextLocation);
    }

    @Test
    void testToString() {
        Location location = new Location(1, 2);
        assertEquals("location " + 1 + "," + 2, location.toString());
    }
    @Test
    void testSadToString() {
        Location location = new Location(1, 2);
        assertNotEquals("location at" + 1 + "," + 2, location.toString());
    }
}

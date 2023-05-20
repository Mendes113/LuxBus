package com.resolucaoproblemas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LuxCompanyTest {
    
    
    @Test
    // testando se o passageiro está na cidade
    public void testRequestPickup() {
        City city = new City();
        LuxCompany company = new LuxCompany(new City(10,10));
        Passenger passenger = new Passenger(new Location(10, 10), new Location(10, 10));
        assertEquals(company(new City(10,10)), passenger(new Location(10, 10)));
    }

    /**
     * a função testa se o veiculo chegou ao local de coleta do passageiro
     */
/**
 * Um veículo chega a um local de coleta.
 */

    @Test
    public void testArrivedAtPickup() {
        City city = new City();
        LuxCompany company = new LuxCompany(city);
        Passenger passenger = new Passenger(new Location(0, 0), new Location(0, 20));
        company.requestPickup(passenger);
        company.arrivedAtPickup(company.getVehicles().get(0));
    }

    
    @Test
    public void testSadArrivedAtPickup() {
        City city = new City();
        LuxCompany company = new LuxCompany(city);
        Passenger passenger = new Passenger(new Location(0, 0), new Location(0, 20));
        company.requestPickup(passenger);
        company.arrivedAtPickup(company.getVehicles().get(2));
    }
    
    
    /**
     * Essa função testa se a classe LUxCompany possui 3 veículos
     */

    @Test
    public void testGetVehicles() {
        City city = new City();
        LuxCompany company = new LuxCompany(city);
        assertTrue(company.getVehicles().size() == 3);
    }
}

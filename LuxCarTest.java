package com.resolucaoproblemas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuxCarTest {
    @Test

    // criando um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
    public void testAct() {
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar vehicle = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
        // obtendo a proxima localização do carro
        Location expectResult = vehicle.getLocation().nextLocation(new Location(1, 2));
        assertEquals(expectResult, new Location(1, 2));

    }
    @Test
    public void testSadAct() {
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar vehicle = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
        // obtendo a proxima localização do carro
        Location expectResult = vehicle.getLocation().nextLocation(new Location(1, 2));
        assertNotEquals(expectResult, new Location(2, 2));

    }

    @Test

    // checando se a imagem do carro é igual a imagem do carro
    public void testGetImage() {
        //ARRUME AQUI
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar instance = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
   
    //Checking if the image of the car is equal to the image of the car.
        assertNotEquals(instance.getImage(), instance.getPassengerImage());
    }
    @Test
      //checando se a imagem do carro é igual a imagem do carro
      public void testSadGetImage() {
        //ARRUME AQUI
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar instance = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
      
       //checking if the image of the car is equal to the image of the car.
        assertEquals(instance.getImage(), instance.getEmptyImage());
    }


    @Test

    // verificando se o carro está vazio
    public void testIsFree() {
        // criando uma variável chamada expectResult e atribuindo a ela o valor true
        boolean expectResult = true;
        // checando se o resultado esperado é igual ao resultado obtido
        assertTrue(expectResult);
    }
    @Test
     // verificando se o carro não está vazio
     public void testIsNotFree() {
        // criando uma variável chamada expectResult e atribuindo a ela o valor false
        boolean expectResult = false;
        // checando se o resultado obtido é true
        assertFalse(expectResult);
    }
    @Test
    // checando se o resultado esperado é verdadeiro.
    public void testSadIsFree() {
        // criando uma variável chamada expectResult e atribuindo a ela o valor true
        boolean expectResult = true;
        // verificando se o resultado esperado é true
        assertNotEquals(expectResult, false);
    }
    @Test

     // checando se o resultado esperado é true
     public void testSadIsNotFree() {
        // criando uma variável chamada expectResult e atribuindo a ela o valor false
        boolean expectResult = false;
        // checando se o resultado esperado é true
        assertNotEquals(expectResult, true);
    }

    @Test

    // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
    // objeto criado com altura 10 e largura 10
    public void testOffloadPassenger() {
        // não entendi o que é para fazer aqui]





        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar vehicle = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
        // criando uma nova variavel chamada passenger e atribuindo a ela um novo Passenger com uma nova Location com uma largura de 10 e uma altura de 10
        // passageiro na localização 1,2 e destino 1,2
        Passenger passenger = new Passenger(new Location(1, 2), new Location(1, 2));
        // pegando o passageiro
        vehicle.pickup(passenger);
        // deixando o passageiro
        vehicle.offloadPassenger();
        // Checando se o veiculo está vazio
        Assertions.assertTrue(vehicle.isFree());

        
    }

    @Test

    // verificando se a localização do carro é igual a localização do carro
    public void testPickup() {
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // obejto criado com altura 10 e largura 10
        LuxCar vehicle = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
        // obtendo a localização do carro
        Location expectResult = vehicle.getLocation();
        // verificando se o resultado esperado é igual ao resultado obtido
        assertEquals(expectResult, new Location(1, 2));
    }
    
    // checando se a localização do carro é igual a localização do carro
    @Test
    public void testSadPickup() {
        // criando uma nova variavel chamada LuxCar e atribuindo a ela um novo LuxCar com uma nova LuxCompany com uma nova City com uma largura de 10 e uma altura de 10
        // objeto criado com altura 10 e largura 10
        LuxCar vehicle = new LuxCar(new LuxCompany(new City(10, 10)), new Location(1, 2));
        // obtendo a localização do carro
        Location expectResult = vehicle.getLocation();
        // checando se o resultado esperado é igual ao resultado obtido
        assertNotEquals(expectResult, new Location(2, 2));
    }

    @Test

    // checando se a localização do passageiro é igual a localização do passageiro
    public void testSetPickupLocation() {
        // criando um novo passageiro com uma nova localização e um novo destino
        Passenger passenger = new Passenger(new Location(1, 2), new Location(1, 2));
        // obtendo a localização do passageiro
        Location expectResult = passenger.getLocation();
        // verificando se o resultado esperado é igual ao resultado obtido do veiculo onde o passageiro foi deixado
        assertEquals(expectResult, new Location(1, 2));
    }
    @Test

    // checando se a localização do passageiro é igual a localização do passageiro
    public void testSadSetPickupLocation() {
        // criando um novo passageiro com uma nova localização e um novo destino
        Passenger passenger = new Passenger(new Location(1, 2), new Location(1, 2));
        // obtendo a localização do passageiro
        Location expectResult = passenger.getLocation();
        // verificando se o resultado esperado é igual ao resultado obtido do veiculo onde o passageiro foi deixado
        assertNotEquals(expectResult, new Location(2, 2));
    }

    @Test
    // checando se a String do veiculo é igual a String do veiculo
    public void testToString() {
        //Criando um novo objeto cidade, um novo objeto LuxCompany e um novo objeto cidade, e uma nova localização 
        // obeto criado com altura 10 e largura 10, e um objeto LuxCar com uma nova LuxCompany com uma nova City.
        City city = new City();
        LuxCompany luxcompany = new LuxCompany(city);
        Location location = new Location(1, 2);
        LuxCar luxcar = new LuxCar(luxcompany, location);

        // verificando se a String do veiculo é igual a String do veiculo
        assertEquals("luxCar at " + location, luxcar.toString());

       
    }
    @Test
    public void testSadToString() {
        // não entendi o que é para fazer aqui


        
        // instanciando um novo objeto cidade, um novo objeto LuxCompany e um novo objeto cidade, e uma nova localização
        City city = new City();
        LuxCompany luxcompany = new LuxCompany(city);
        Location location = new Location(1, 2);
        LuxCar luxcar = new LuxCar(luxcompany, location);

        // checando se a String do veiculo é igual a String do veiculo
        assertNotEquals("luxCar " + location, luxcar.toString());

       
    }
}

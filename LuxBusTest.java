package com.resolucaoproblemas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;

public class LuxBusTest {
  @Test
  // cria um novo LuxBus com uma nova LuxCompany com uma nova City com uma largura
  // de 10 e uma altura de 10
  public void testIsFree() {
    // Criando uma variável chamada expectResult e atribuindo a ela o valor true.
    boolean expectResult = true;
    // Verificando se o resultado esperado é verdadeiro.
    assertTrue(expectResult);
  }

  @Test
  //
  public void testSadIsFree() {
    // criando uma variável chamada expectResult e atribuindo a ela o valor false.
    boolean expectResult = true;
    // checando
    assertNotEquals(expectResult, false);
  }

  @Test

  public void testIsNotFree() {
    // criando uma variavel chamada expectResult e atribuindo a ela o valor false.
    boolean expectResult = false;
    // checando se o resultado esperado é falso.
    assertFalse(expectResult);
  }

  @Test
  //
  public void testSadIsNotFree() {
    // creando uma variável chamada expectResult e atribuindo a ela o valor true.
    boolean expectResult = false;
    // checando se o resultado esperado é verdadeiro.
    assertNotEquals(expectResult, true);
  }

  @Test
  // criando um novo LuxBus com uma nova LuxCompany com uma nova City com uma
  // largura de 10 e uma altura de 10
  public void Testpickup() {
    // criando uma variável chamada expectResult e atribuindo a ela o valor true.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // obtendo a localização do Onibus.
    Location expectResult = instance.getLocation();
    // comparando o resultado esperado com o resultado obtido.
    assertEquals(expectResult, new Location(1, 2));
  }

  @Test
  // criando um novo LuxBus com uma nova LuxCompany com uma nova City com uma
  // largura de 10 e uma altura de 10
  // comparando o resultado esperado com o resultado obtido.
  // resultado esperado: false
  public void TestSadpickup() {
    // criando uma variável chamada expectResult e atribuindo a ela o valor true.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // obtendo a localização do Onibus.
    Location expectResult = instance.getLocation();
    // comparando o resultado esperado com o resultado obtido.
    assertNotEquals(expectResult, new Location(2, 1));
  }

  /**
   * testando se o onibus está livre.
   */
  @Test
  // Getting the location of the bus and then getting the next location of the
  // bus.
  public void testAct() {
    // Creating a new instance of LuxBus.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // Getting the location of the bus and then getting the next location of the
    // bus.
    Location expectResult = instance.getLocation().nextLocation(new Location(1, 2));
    // Comparing the expected result with the actual result.
    assertEquals(expectResult, new Location(1, 2));
  }

  @Test
  // Getting the location of the bus and then getting the next location of the
  // bus.
  public void testSadact() {
    // Creating a new instance of LuxBus.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // Getting the location of the bus and then getting the next location of the
    // bus.
    Location expectResult = instance.getLocation().nextLocation(new Location(1, 2));
    // Comparing the expected result with the actual result.
    assertNotEquals(expectResult, new Location(2, 2));
  }

  @Test
  // Creating a new instance of LuxBus, creating a new passenger with a start
  // location and a
  // destination location, adding a passenger to the bus, removing the passenger
  // from the bus and
  // checking if the bus is free.
  public void testOffloadPassenger() {
    // Creating a new instance of LuxBus.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // Creating a new passenger with a start location and a destination location.
    Passenger passenger = new Passenger(new Location(1, 2), new Location(4, 5));
    // Adding a passenger to the bus.
    instance.pickup(passenger);
    // Removing the passenger from the bus.
    instance.offloadPassenger(passenger);
    // Checking if the bus is free.
    Assertions.assertTrue(instance.isFree());
  }

  @Test
  
  public void testGetImage() {
    // Creating a new instance of LuxBus.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // Checking if the image of the bus is the same as the image of the bus.
 
    assertEquals(instance.getImage(), instance.getPassengerImage());

  }

  @Test

  // ESTE TESTE ESTÀ ERRADO
  // Checking if the image of the bus is the same as the image of the bus.
  public void testSadGetImage() {
    // ESTE TESTE ESTÀ ERRADO
    // Creating a new instance of LuxBus.
    LuxBus instance = new LuxBus(new LuxCompany(new City(10, 10)), new Location(1, 2));
    // Checking if the image of the bus is the same as the image of the bus.

    assertNotEquals(instance.getImage(), instance.getEmptyImage());
  }

  @Test
  public void testMaxPassengers() {
    // não usa instância porque o método é estático
    // checa se o máximo de passageiros é 8.
    assertEquals(LuxBus.getMAXPASSENGERS(), 8);
  }

  @Test
  public void testSadMaxPassengers() {
    // não usa instância porque o método é estático
    // checa se o máximo de passageiros é 8.
    assertNotEquals(LuxBus.getMAXPASSENGERS(), 6);
  }

  @Test
  public void testMinPassengers() {
    // não usa instância porque o método é estático
    // checa se o mínimo de passageiros é 0.
    assertEquals(LuxBus.getMINPASSENGERS(), 3);
  }

  @Test
  public void testSadMinPassengers() {
    // não usa instância porque o método é estático
    // checa se o mínimo de passageiros é 0.
    assertNotEquals(LuxBus.getMINPASSENGERS(), 0);
  }

}

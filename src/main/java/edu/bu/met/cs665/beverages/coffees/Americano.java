/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Americano.java
 * Description: This class is responsible for the methods and attributes of an Americano.
 */

package edu.bu.met.cs665.beverages.coffees;

/**
 * This is the Americano class.
 * This class is responsible for representing an Americano which is a subclass of Coffee.
 */
public class Americano extends Coffee {

  /**
   * Create an Americano object by passing the name and ingredient amounts to the parent class.
   */
  public Americano() {
    super("Americano", 2, 6, 0);
  }
}

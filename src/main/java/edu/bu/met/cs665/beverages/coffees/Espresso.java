/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Espresso.java
 * Description: This class is responsible for the methods and attributes of an Espresso.
 */

package edu.bu.met.cs665.beverages.coffees;

/**
 * This is the Espresso class.
 * This class is responsible for representing an Espresso which is a subclass of Coffee.
 */
public class Espresso extends Coffee {

  /**
   * Create an Espresso object by passing the name and ingredient amounts to the parent class.
   */
  public Espresso() {
    super("Espresso", 2, 0, 0);
  }
}

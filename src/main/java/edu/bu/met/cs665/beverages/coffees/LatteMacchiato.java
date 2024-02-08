/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: LatteMacchiato.java
 * Description: This class is responsible for the methods and attributes of a LatteMacchiato.
 */

package edu.bu.met.cs665.beverages.coffees;

/**
 * This is the LatteMacchiato class.
 * This class is responsible for representing an LatteMacchiato which is a subclass of Coffee.
 */
public class LatteMacchiato extends Coffee {

  /**
   * Create an LatteMacchiato object by passing the name and ingredient
   * amounts to the parent class.
   */
  public LatteMacchiato() {
    super("Latte Macchiato", 2, 0, 4);
  }
}

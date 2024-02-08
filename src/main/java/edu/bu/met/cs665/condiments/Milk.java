/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Milk.java
 * Description: This class is responsible for the methods and attributes of Milk.
 */

package edu.bu.met.cs665.condiments;

import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Milk class.
 * This class is responsible for representing Milk which is a subclass of Condiment.
 */
public class Milk extends Condiment {

  /**
   * Create a Milk object by passing the name and CONDIMENT_BASE_PRICE value to the parent class.
   */
  public Milk() {
    super("Milk", Constants.CONDIMENT_BASE_PRICE);
  }

  /**
   * Implement the abstract function addToBeverage. Adds Condiment to the Beverage being made.
   */
  @Override
  public void addToBeverage() {
    System.out.println("Now adding " + this.name);
  }
}

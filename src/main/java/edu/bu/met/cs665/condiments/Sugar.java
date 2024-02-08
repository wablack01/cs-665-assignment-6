/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Sugar.java
 * Description: This class is responsible for the methods and attributes of Sugar.
 */

package edu.bu.met.cs665.condiments;

import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Sugar class.
 * This class is responsible for representing Sugar which is a subclass of Condiment.
 */
public class Sugar extends Condiment {

  /**
   * Create a Sugar object by passing the name and CONDIMENT_BASE_PRICE value to the parent class.
   */
  public Sugar() {
    super("Sugar", Constants.CONDIMENT_BASE_PRICE);
  }

  /**
   * Implement the abstract function addToBeverage. Adds Condiment to the Beverage being made.
   */
  @Override
  public void addToBeverage() {
    System.out.println("Now adding " + this.name);
  }
}

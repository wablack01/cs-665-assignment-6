/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Coffee.java
 * Description: This class is responsible for the methods and attributes of a Coffee.
 */

package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Coffee class.
 * This class is responsible for representing a Coffee which is a subclass of Beverage
 */
public class Coffee extends Beverage {

  double espressoQty;
  double steamedMilkQty;

  /**
   * Create a Coffee object by passing the given name and COFFEE_BASE_PRICE values
   * to the parent class.
   *
   * @param name the name/type of the Coffee
   * @param waterQty the quantity of water used in the coffee
   * @param espressoQty the quantity of espresso used in the coffee
   * @param steamedMilkQty the quantity of steamed milk used in the coffee
   */
  public Coffee(String name, double waterQty, double espressoQty, double steamedMilkQty) {
    super(name, Constants.COFFEE_BASE_PRICE, waterQty);
    this.espressoQty = espressoQty;
    this.steamedMilkQty = steamedMilkQty;
  }

  /**
   * Implement the abstract function makeBeverage. Standard function for making Coffee.
   */
  @Override
  public void makeBeverage() {
    System.out.println("Now making " + this.name);
  }
}

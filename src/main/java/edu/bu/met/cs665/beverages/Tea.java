/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Tea.java
 * Description: This class is responsible for the methods and attributes of a Tea.
 */

package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Tea class.
 * This class is responsible for representing a Tea which is a subclass of Beverage
 */
public class Tea extends Beverage {

  double teaLeavesQty;

  /**
   * Create a Tea object by passing the given name and TEA_BASE_PRICE values to the parent class.
   *
   * @param name the name/type of the Tea
   * @param waterQty quantity of water to use
   * @param teaLeavesQty quantity of tea leaves
   */
  public Tea(String name, double waterQty, double teaLeavesQty) {
    super(name, Constants.TEA_BASE_PRICE, waterQty);
    this.teaLeavesQty = teaLeavesQty;
  }

  /**
   * Implement the abstract function makeBeverage. Standard function for making Tea.
   */
  @Override
  public void makeBeverage() {
    System.out.println("Now making " + this.name);
  }
}

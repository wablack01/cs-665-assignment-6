/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Tea.java
 * Description: This abstract class is responsible for the methods and attributes of a Tea.
 */

package edu.bu.met.cs665.beverages.teas;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Tea abstract class.
 * This class is responsible for representing a Tea which is a subclass of Beverage and a parent
 * to several subclasses.
 */
public abstract class Tea extends Beverage {

  double teaLeavesQty;
  double waterQty;

  /**
   * Create a Tea object by passing the given name and TEA_BASE_PRICE values to the parent class.
   *
   * @param name the name/type of the Tea
   * @param teaLeavesQty quantity of tea leaves
   * @param waterQty quantity of water to use
   */
  public Tea(String name, double teaLeavesQty, double waterQty) {
    super(name, Constants.TEA_BASE_PRICE);
    this.teaLeavesQty = teaLeavesQty;
    this.waterQty = waterQty;
  }

  /**
   * Implement the abstract function makeBeverage. Standard function for making Tea.
   */
  @Override
  public void makeBeverage() {
    System.out.println("Now making " + this.name);
  }
}

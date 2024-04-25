/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Condiment.java
 * Description: This abstract class is responsible for the methods and attributes of a Condiment.
 */

package edu.bu.met.cs665.condiments;

import edu.bu.met.cs665.constants.Constants;

/**
 * This is the Condiment abstract class.
 * This class is responsible for representing a Condiment which the customer can add to a Beverage
 */
public class Condiment {

  private CondimentType type;
  private double price = Constants.CONDIMENT_BASE_PRICE;
  int quantity = 0;

  /**
   * Create a Condiment object of the given type.
   *
   * @param type the type of the Condiment
   */
  public Condiment(CondimentType type) {
    this.type = type;
  }

    /**
   * Getter for the type of Condiment.
   *
   * @return the type of the Condiment
   */
  public CondimentType getType() {
    return type;
  }

  /**
   * Getter for the price of the Condiment.
   *
   * @return the price of the Condiment
   */
  public double getPrice() {
    return price;
  }

  /**
   * Getter for the quantity of the Condiment.
   *
   * @return the quantity of the Condiment
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Method to increase the quantity of the condiment by 1 unless the current quantity
   * equals the CONDIMENT_MAX_QTY value. Returns the total quantity increase (either 1 or 0).
   *
   * @return the amount by which the quantity increased
   */
  public int increaseQuantity() {
    if (this.quantity == Constants.CONDIMENT_MAX_QTY) {
      return 0;
    }
    this.quantity++;
    return 1;
  }

  /**
   * Method to decrease the quantity of the condiment by 1.
   */
  public void decreaseQuantity() {
    this.quantity--;
  }
}

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
public abstract class Condiment {

  protected String name;
  private double price;
  int quantity;

  /**
   * Create a Condiment object with the given name and price values and setting the quantity to 0.
   *
   * @param name the name/type of the Condiment
   * @param price the price of the Condiment
   */
  public Condiment(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 0;
  }

  /**
   * Getter for the name of the Condiment.
   *
   * @return the name of the Condiment
   */
  public String getName() {
    return name;
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

  /**
   * Abstract method to add the Condiment to the prepared beverage. Must be implemented
   * by the subclasses. In full implementation this will activate physical processes of
   * the machine to add the condiment to the drink being prepared.
   */
  public abstract void addToBeverage();
}

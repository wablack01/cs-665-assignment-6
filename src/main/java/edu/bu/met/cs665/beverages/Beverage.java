/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Beverage.java
 * Description: This abstract class is responsible for the methods and attributes of a Beverage.
 */

package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.condiments.Condiment;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the Beverage abstract class.
 * This class is responsible for representing a beverage which is the parent class for the
 * different types of beverages a customer can order from the machine.
 */
public abstract class Beverage {

  protected String name;
  private double price;
  private final Map<String, Condiment> condiments;

  /**
   * Create a Beverage object and initialize with the given name and price values.
   *
   * @param name the name/type of the beverage
   * @param price the price of the beverage
   */
  public Beverage(String name, double price) {
    this.name = name;
    this.price = price;
    this.condiments = new HashMap<>();
  }

  /**
   * Getter for the name of the Beverage.
   *
   * @return the name of the Beverage
   */
  public String getName() {
    return name;
  }

  /**
   * Getter for the price of the Beverage.
   *
   * @return the price of the Beverage
   */
  public double getPrice() {
    return price;
  }

  /**
   * Method to add a Condiment to the condiments Map. This function is largely for record keeping
   * so the Beverage object has a record of the Condiments that have been added to it and its
   * total cost when it was ordered. The actual adding of the Condiments (calling the Condiment
   * addToBeverage function) is done in the BeverageMachine class.
   */
  public void condimentAdded(Condiment condiment) {
    this.condiments.put(condiment.getName(), condiment);
    price += condiment.getPrice() * condiment.getQuantity();
  }

  /**
   * Getter method for condiments. Condiments map should be null until after drink is made.
   *
   * @return the Map of added condiments
   */
  public Map<String, Condiment> getCondiments() {
    return this.condiments;
  }

  /**
   * Abstract method to make the beverage. Must be implemented by subclasses.
   * In full implementation this will activate physical processes of the machine to make
   * the selected Beverage.
   */
  public abstract void makeBeverage();
}

/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: BeverageMachine.java
 * Description: This class is responsible for the methods and attributes of a BeverageMachine.
 */

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.condiments.Condiment;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the BeverageMachine class.
 * This class is responsible for representing an automated beverage vending machine.
 * It provides methods for selecting beverages, selecting condiments, and placing an order.
 */
public class BeverageMachine {
  private Beverage currentBeverage;
  private Map<String, Condiment> currentCondiments;
  private double totalPrice;

  /**
   * Create a BeverageMachine object and initialize with null values.
   */
  public BeverageMachine() {
    this.currentBeverage = null;
    this.currentCondiments = new HashMap<>();
    this.totalPrice = 0;
  }

  /**
   * Setter method for cyrrentBeverage. Also clears currentCondiments and adjusts total price.
   *
   * @param beverage the type of beverage the user is preparing to order
   */
  public void setCurrentBeverage(Beverage beverage) {
    this.currentBeverage = beverage;
    this.currentCondiments.clear();
    this.totalPrice = beverage.getPrice();
  }

  /**
   * Getter method for cyrrentBeverage.
   *
   * @return the currently selected Beverage
   */
  public Beverage getCurrentBeverage() {
    return this.currentBeverage;
  }

  /**
   * Method to delete the currentBeverage. This clears and resets the user's order.
   */
  public void deleteCurrentBeverage() {
    this.currentBeverage = null;
    this.currentCondiments.clear();
    this.totalPrice = 0;
  }

  /**
   * Getter method for currentCondiments.
   *
   * @return the Map of currently selected Condiments
   */
  public Map<String, Condiment> getCurrentCondiments() {
    return this.currentCondiments;
  }

  /**
   * Adds a condiment or increases the quantity of a condiment in the currentCondiments Map.
   * The total price of the order is adjusted according to the added quantity, either 1 or 0,
   * and the price of the condiment.
   *
   * @param newCondiment the type of condiment to add
   */
  public void addCondiment(Condiment newCondiment) {
    if (currentBeverage == null) {
      return;
    }

    String condimentName = newCondiment.getName();
    Condiment addedCondiment = currentCondiments.getOrDefault(condimentName, newCondiment);
    int addedQty = addedCondiment.increaseQuantity();
    currentCondiments.put(condimentName, addedCondiment);

    totalPrice += (addedQty * newCondiment.getPrice());
  }

  /**
   * Lowers the quantity of a condiment from the currentCondiments Map. If the quantity is
   * reduced to 0 the condiment is removed entirely. The total price is reduced by the price
   * of the removed condiment.
   *
   * @param condimentName the name of the condiment to remove
   */
  public void removeCondiment(String condimentName) {
    if (currentBeverage == null) {
      return;
    }

    Condiment selectedCondiment = currentCondiments.get(condimentName);
    if (selectedCondiment == null) {
      return;
    }

    selectedCondiment.decreaseQuantity();
    if (selectedCondiment.getQuantity() == 0) {
      currentCondiments.remove(condimentName);
    }

    totalPrice -= selectedCondiment.getPrice();
  }

  /**
   * Getter for the totalPrice.
   *
   * @return the total price
   */
  public double getTotalPrice() {
    return this.totalPrice;
  }

  /**
   * Makes the selected beverage and adds the selected condiments. Clears the currentBeverage
   * object and returns the completed beverage.
   *
   * @return the completed beverage which has been made by the machine with all condiments added
   */
  public Beverage placeOrder() {
    if (currentBeverage == null) {
      return null;
    }

    currentBeverage.makeBeverage();
    currentCondiments.forEach((name,condiment) -> {
      condiment.addToBeverage();
      currentBeverage.condimentAdded(condiment);
    });

    Beverage completedBeverage = currentBeverage;
    this.deleteCurrentBeverage();

    return completedBeverage;
  }
}

/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: CoffeeTeaBeverageFactory.java
 * Description: This class is responsible for the methods and attributes of a CoffeeTeaBeverageFactory.
 */

package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.beverages.Coffee;
import edu.bu.met.cs665.beverages.Tea;

import static edu.bu.met.cs665.constants.Constants.*;

/**
 * This is the CoffeeTeaBeverageFactory class. It creates Beverages of different types
 * and with different ingredients.
 */
public class CoffeeTeaBeverageFactory extends BeverageFactory {

  @Override
  public Beverage createBeverage(String type) {
    switch (type) {
      case "Americano":
        return new Coffee(type,  AMERICANO_WATER, AMERICANO_ESPRESSO, AMERICANO_STEAMED_MILK);
      case "Espresso":
        return new Coffee(type, ESPRESSO_WATER, ESPRESSO_ESPRESSO, ESPRESSO_STEAMED_MILK);
      case "Latte Macchiato":
        return new Coffee(type, LATTE_MACCHIATO_WATER, LATTE_MACCHIATO_ESPRESSO, LATTE_MACCHIATO_STEAMED_MILK);
      case "Black Tea":
      case "Green Tea":
      case "Yellow Tea":
        return new Tea(type, TEA_WATER, TEA_LEAVES);
      default:
        return null;
    }
  }
}

/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Constants.java
 * Description: This class has static constants used throughout the application.
 */

package edu.bu.met.cs665.constants;

/**
 * This is the Constants class.
 * It is a library of static constants used throughout the application.
 */
public class Constants {
  //Base prices
  public static final double COFFEE_BASE_PRICE = 2.0;
  public static final double TEA_BASE_PRICE = 1.5;
  public static final double CONDIMENT_BASE_PRICE = 0.5;

  //Max condiment quantity
  public static final int CONDIMENT_MAX_QTY = 3;

  //Ingredients
  public static final int AMERICANO_WATER = 6;
  public static final int AMERICANO_ESPRESSO = 2;
  public static final int AMERICANO_STEAMED_MILK = 0;

  public static final int ESPRESSO_WATER = 0;
  public static final int ESPRESSO_ESPRESSO = 2;
  public static final int ESPRESSO_STEAMED_MILK = 0;

  public static final int LATTE_MACCHIATO_WATER = 0;
  public static final int LATTE_MACCHIATO_ESPRESSO = 2;
  public static final int LATTE_MACCHIATO_STEAMED_MILK = 4;

  public static final int TEA_WATER = 6;
  public static final int TEA_LEAVES = 0;

  private Constants() {}
}

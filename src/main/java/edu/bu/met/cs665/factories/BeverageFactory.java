/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: BeverageFactory.java
 * Description: This abstract class is responsible for the methods and attributes of a BeverageFactory.
 */

package edu.bu.met.cs665.factories;

/**
 * This is the BeverageFactory abstract class. It defines a method signature
 * that all subclasses will implement to create and return a Beverage object.
 */
import edu.bu.met.cs665.beverages.Beverage;

public abstract class BeverageFactory {
  public abstract Beverage createBeverage(String type);
}

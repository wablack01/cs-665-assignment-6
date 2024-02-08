/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: BlackTea.java
 * Description: This class is responsible for the methods and attributes of a BlackTea.
 */

package edu.bu.met.cs665.beverages.teas;

/**
 * This is the BlackTea class.
 * This class is responsible for representing a BlackTea which is a subclass of Tea.
 */
public class BlackTea extends Tea {

  /**
   * Create a BlackTea object by passing the name and ingredient amounts to the parent class.
   */
  public BlackTea() {
    super("Black Tea", 1, 6);
  }
}

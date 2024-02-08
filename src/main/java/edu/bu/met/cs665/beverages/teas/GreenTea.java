/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: GreenTea.java
 * Description: This class is responsible for the methods and attributes of a GreenTea.
 */

package edu.bu.met.cs665.beverages.teas;

/**
 * This is the GreenTea class.
 * This class is responsible for representing a GreenTea which is a subclass of Tea.
 */
public class GreenTea extends Tea {

  /**
   * Create a GreenTea object by passing the name and ingredient amounts to the parent class.
   */
  public GreenTea() {
    super("Green Tea", 1, 6);
  }
}

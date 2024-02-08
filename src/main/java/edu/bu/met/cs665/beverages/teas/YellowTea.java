/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: YellowTea.java
 * Description: This class is responsible for the methods and attributes of a YellowTea.
 */

package edu.bu.met.cs665.beverages.teas;

/**
 * This is the YellowTea class.
 * This class is responsible for representing a YellowTea which is a subclass of Tea.
 */
public class YellowTea extends Tea {

  /**
   * Create a YellowTea object by passing the name and ingredient amounts to the parent class.
   */
  public YellowTea() {
    super("Yellow Tea", 1, 6);
  }
}

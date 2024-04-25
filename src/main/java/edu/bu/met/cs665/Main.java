/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Main.java
 * Description: This class is the entry point to the application
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.condiments.CondimentType;
import edu.bu.met.cs665.machine.BeverageMachine;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    BeverageMachine beverageMachine = new BeverageMachine();
    beverageMachine.setCurrentBeverage("Americano");
    beverageMachine.addCondiment(CondimentType.SUGAR);
    beverageMachine.addCondiment(CondimentType.MILK);
    beverageMachine.placeOrder();
  }
}

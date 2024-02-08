/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Main.java
 * Description: This class is the entry point to the application
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.beverages.coffees.Americano;
import edu.bu.met.cs665.condiments.Milk;
import edu.bu.met.cs665.condiments.Sugar;
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
    beverageMachine.setCurrentBeverage(new Americano());
    beverageMachine.addCondiment(new Sugar());
    beverageMachine.addCondiment(new Milk());
    beverageMachine.placeOrder();
  }
}

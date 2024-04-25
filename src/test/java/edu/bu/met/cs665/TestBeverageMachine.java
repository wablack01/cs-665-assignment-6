/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: TestBeverageMachine.java
 * Description: This class is responsible for testing the BeverageMachine class and
 * the Beverage and Condiment classes it uses.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.condiments.Condiment;
import edu.bu.met.cs665.condiments.CondimentType;
import edu.bu.met.cs665.constants.Constants;
import edu.bu.met.cs665.machine.BeverageMachine;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * This is the TestBeverageMachine class.
 * This class contains unit tests to verify the functionality of the BeverageMachine.
 */
public class TestBeverageMachine {

    /**
     * Empty constructor to avoid instantiation
     */
    public TestBeverageMachine() {}

    /**
     * This function tests the Beverage class and currentBeverage field of BeverageMachine.
     */
    @Test
    public void testCurrentBeverage() {
        BeverageMachine beverageMachine = new BeverageMachine();
        assertNull(beverageMachine.getCurrentBeverage());

        beverageMachine.setCurrentBeverage("Americano");
        Beverage currentBeverage = beverageMachine.getCurrentBeverage();
        assertEquals("Americano", currentBeverage.getName());
        assertEquals(2.0, currentBeverage.getPrice(), 0);
    }

    /**
     * This function tests the condiment quantity functionality. Should increase quantity up to a max
     * quantity defined in the Constants class. Should decrease quantity until 0 when the Condiment is removed.
     */
    @Test
    public void testCondimentQuantity() {
        BeverageMachine beverageMachine = new BeverageMachine();
        beverageMachine.setCurrentBeverage("Americano");

        for (int i = 0; i < Constants.CONDIMENT_MAX_QTY; i++) {
          beverageMachine.addCondiment(CondimentType.SUGAR);
        }
        Map<CondimentType, Condiment> condiments = beverageMachine.getCurrentCondiments();
        assertEquals(3, condiments.get(CondimentType.SUGAR).getQuantity());

        //should not add because already max quantity
        beverageMachine.addCondiment(CondimentType.SUGAR);
        assertEquals(3, condiments.get(CondimentType.SUGAR).getQuantity());

        beverageMachine.removeCondiment(CondimentType.SUGAR);
        assertEquals(2, condiments.get(CondimentType.SUGAR).getQuantity());

        //condiment removed at quantity 0
        beverageMachine.removeCondiment(CondimentType.SUGAR);
        beverageMachine.removeCondiment(CondimentType.SUGAR);
        assertNull(condiments.get(CondimentType.SUGAR));
    }

    /**
     * This function tests the totalPrice field of BeverageMachine. Should start at 0
     * and be updated when a Beverage is selected and when Condiment quantity changes.
     */
    @Test
    public void testTotalPrice() {
        BeverageMachine beverageMachine = new BeverageMachine();
        assertEquals(0, beverageMachine.getTotalPrice(), 0);

        beverageMachine.setCurrentBeverage("Americano");
        assertEquals(Constants.COFFEE_BASE_PRICE, beverageMachine.getTotalPrice(), 0);

        beverageMachine.addCondiment(CondimentType.SUGAR);
        assertEquals(
                Constants.COFFEE_BASE_PRICE + Constants.CONDIMENT_BASE_PRICE,
                beverageMachine.getTotalPrice(),
                0
        );

        beverageMachine.removeCondiment(CondimentType.SUGAR);
        assertEquals(Constants.COFFEE_BASE_PRICE, beverageMachine.getTotalPrice(), 0);
    }

    /**
     * This function tests the deleteCurrentBeverage function of BeverageMachine. Should delete the
     * currentBeverage, clear the condiments Map, and reset the price to 0.
     */
    @Test
    public void testDeleteCurrentBeverage() {
        BeverageMachine beverageMachine = new BeverageMachine();
        beverageMachine.setCurrentBeverage("Americano");
        beverageMachine.addCondiment(CondimentType.SUGAR);
        beverageMachine.deleteCurrentBeverage();

        assertNull(beverageMachine.getCurrentBeverage());
        assertTrue(beverageMachine.getCurrentCondiments().isEmpty());
        assertEquals(0, beverageMachine.getTotalPrice(), 0);
    }

    /**
     * This function tests the placeOrder function of BeverageMachine. completedBeverage should have the
     * correct price and quantity of the drink and all added condiments. Should also reset beverageMachine
     * so it is ready for a new order.
     */
    @Test
    public void testPlaceOrder() {
        BeverageMachine beverageMachine = new BeverageMachine();
        beverageMachine.setCurrentBeverage("Americano");
        beverageMachine.addCondiment(CondimentType.SUGAR);
        beverageMachine.addCondiment(CondimentType.MILK);

        //ordered beverage properly configured
        Beverage completedBeverage = beverageMachine.placeOrder();
        double expectedPrice = Constants.COFFEE_BASE_PRICE + (Constants.CONDIMENT_BASE_PRICE * 2);
        Map<CondimentType, Condiment> addedCondiments = completedBeverage.getCondiments();
        assertEquals(expectedPrice, completedBeverage.getPrice(), 0);
        assertEquals(1, addedCondiments.get(CondimentType.SUGAR).getQuantity());
        assertEquals(1, addedCondiments.get(CondimentType.MILK).getQuantity());

        //beverageMachine has been reset
        assertNull(beverageMachine.getCurrentBeverage());
        assertTrue(beverageMachine.getCurrentCondiments().isEmpty());
        assertEquals(0, beverageMachine.getTotalPrice(), 0);
    }
}

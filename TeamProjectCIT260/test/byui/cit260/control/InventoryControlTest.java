/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SamanthaMalena
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcPerimeter method, of class InventoryControl.
     */
    @Test
    public void testCalcPerimeter() {
        System.out.println("calcPerimeter");
        
        System.out.println("Test Case 1");
        double length = 10.0;
        double width = 20.0;
        double expResult = 60.0;
        double result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 2");
        length = -10.0;
        width = 4.0;
        expResult = -1.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        length = 7.0;
        width = -34.0;
        expResult = -1.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        length = 0.0;
        width = 200.0;
        expResult = 400.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
        length = 200.0;
        width = 0.0;
        expResult = 400.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 6");
        length = 201.0;
        width = 2.0;
        expResult = -1.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 7");
        length = 6.0;
        width = -201.0;
        expResult = -1.0;
        result = InventoryControl.calcPerimeter(length, width);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcArea method, of class InventoryControl.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcArea");
        System.out.println("Test Case 1");
        double base1 = 4.0;
        double base2 = 23.0;
        double height = 12.0;
        double expResult = 162.0;
        double result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 2");
        base1 = -9.0;
        base2 = 15.0;
        height = 2.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        base1 = 15.0;
        base2 = -45.0;
        height = 32.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        base1 = 13.0;
        base2 = 20.0;
        height = -12.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
        base1 = 0.0;
        base2 = 50.0;
        height = 0.0;
        expResult = 0.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 6");
        base1 = 50.0;
        base2 = 0.0;
        height = 0.0;
        expResult = 0.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 7");
        base1 = 0.0;
        base2 = 0.0;
        height = 25.0;
        expResult = 0.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 8");
        base1 = 2.0;
        base2 = 2.0;
        height = 26.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 9");
        base1 = 2.0;
        base2 = 51.0;
        height = 2.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 10");
        base1 = 51.0;
        base2 = 2.0;
        height = 2.0;
        expResult = -1.0;
        result = InventoryControl.calcArea(base1, base2, height);
        assertEquals(expResult, result, 0.0);
    }
    
    
}

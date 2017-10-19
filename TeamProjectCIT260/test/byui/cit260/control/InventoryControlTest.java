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
    
    
}

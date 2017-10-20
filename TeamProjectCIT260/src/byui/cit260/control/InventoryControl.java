/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;

/**
 *
 * @author SamanthaMalena
 */
public class InventoryControl {
    
   public static double calcPerimeter(double length, double width){
    if (length < 0 || length > 200 || width < 0 || width > 200) {
       return -1;
    }
    else { 
       return 2 * (length + width);
    }
   }
   public static double calcArea(double length, double width){
    if (length < 0 || length > 200 || width < 0 || width > 200) {
       return -1;
    }
    else { 
       return 2 * (length + width);
    }
   }
   
}

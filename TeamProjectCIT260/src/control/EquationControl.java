/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author SamanthaMalena
 */
public class EquationControl {
    
    
    
    
    
   public static double calcPerimeter(double length, double width){
    if (length < 0 || length > 200 || width < 0 || width > 200) {
       return -1;
    }
    else { 
       return 2 * (length + width);
    }
   }
   public static double calcArea(double base1, double base2, double height){
    if (base1 < 0 || base1 > 50) {
       return -1;
    }
    if ( base2 < 0 || base2 > 50){
        return -1;
    }
    if (height < 0 || height > 25){
        return -1;
    }
    else { 
       return ((base1 + base2)/2)* height;
    }
   }
   public static double calcSurfaceArea(double side, double height){
        if (side < 0 || side > 200 || height < 0 || height > 200){
            return -1;
        }
        else{
            return (side * side) + (2 * side) * Math.sqrt(((side * side) / 4) + (height * height));
        }
   }
   
}

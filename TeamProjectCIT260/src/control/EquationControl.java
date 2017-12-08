/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.EquationControlException;

/**
 *
 * @author SamanthaMalena
 */
public class EquationControl {
    
    public EquationControl(){
        
    }
    
    
    
   public static double calcPerimeter(double length, double width) throws EquationControlException {
    if (length < 0 || length > 200 || width < 0 || width > 200) {
       throw new EquationControlException("the values can't be negative or greater than 200!!!!");
    }
    else { 
       return 2 * (length + width);
    }
   }
   
   public static double calcArea(double base1, double base2, double height) throws EquationControlException{
    if (base1 < 0 || base1 > 50) {
       throw new EquationControlException("the values can't be negative or greater than 200!!!!");
    }
    if ( base2 < 0 || base2 > 50){
        throw new EquationControlException("the values can't be negative or greater than 200!!!!");
    }
    if (height < 0 || height > 25){
        throw new EquationControlException("the values can't be negative or greater than 200!!!!");
    }
    else { 
       return ((base1 + base2)/2)* height;
    }
   }
   
   
   public static double calcSurfaceArea(double side, double height) throws EquationControlException{
        if (side < 1 || side > 200 || height < 1 || height > 200){
            throw new EquationControlException("the values can't be negative or greater than 200!!!!");
        }
        else{
            double equation = (side * side) + (2 * side) * Math.sqrt(side * side / 4 + (height * height))  ;
            return Math.round(100 * equation)/100.0;
        }
   }
}



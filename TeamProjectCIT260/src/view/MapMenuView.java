/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author Samantha Hancock
 */
public class MapMenuView {
    
    public MapMenuView(){
    
    }
    
    public void display(){
        boolean endView = false;
        do{
            String[] inputs = getInputs();
            if (inputs == null || inputs.length < 1 || inputs[0].toUpperCase().equals("Q") ){
                return;
            }
            endView = this.doAction(inputs);
        }
        while(endView == false);
    }
    public String[] getInputs(){
        String[] inputs = new String[1];
        System.out.println("\n*****ThisIsTheWelcomeBanner*****");
        boolean valid = false;
        while (valid == false){
            System.out.println("\nEnter The Player's name");
            Scanner infile = new Scanner(System.in);
            String name = infile.nextLine();
            name.trim();
            if (name.length() < 1){
                System.out.println("\nyou must enter a value");
            }
            else{
                inputs[0] = name;
                valid = true;
            }
            
        }
        return inputs;
    }

     private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "E":
                this.displayExploreMenu();
                break;
            case "I":
                this.displayInfo();
                break;
            case "Q":
                break;
        }
        return true;
    }
   
    public void displayExploreMenu() {
   
    }
    public void displayInfo() {
    
    }
    
}

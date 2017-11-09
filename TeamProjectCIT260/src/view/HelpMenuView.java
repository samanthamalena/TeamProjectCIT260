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
public class HelpMenuView extends View {
    
    public HelpMenuView(){
    
    }
   
    @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nHelp Menu prompot");
        return inputs;
    }

   @Override
   public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "D":
                this.displayDockMenuHelp();
                break;
            case "I":
                this.displayInventoryMenuHelp();
                break;
            case "B":
                this.displayBoatMenuHelp();
                break;
            case "M":
                this.displayMapMenuHelp();
                break;
            case "Q":
                break;
        }
        return true;
    }
   
    public void displayDockMenuHelp() {
    
    }
    public void displayInventoryMenuHelp() {
    
    }
    public void displayBoatMenuHelp() {
    
    }
    public void displayMapMenuHelp() {
    
    }
}


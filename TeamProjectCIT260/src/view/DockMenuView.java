/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Samantha Hancock
 */
public class DockMenuView extends View {
    
    public DockMenuView(){
    
    }
    
    @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nYou are on the dock. Take a rest from your travels ");
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "S":
                this.displaySaveMenu();
                break;
            case "E":
                this.displayMapMenu();
                break;
            case "B":
                this.displayBoatMenu();
                break;
            case "Q":
                break;
        }
        return true;
    }
   
    public void displaySaveMenu() {
    
    }
    public void displayMapMenu() {
        MapMenuView map = new MapMenuView();
        map.display();
    
    }
    public void displayBoatMenu() {
    
    }
    
}

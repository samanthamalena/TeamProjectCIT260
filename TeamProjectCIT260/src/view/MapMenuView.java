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
public class MapMenuView extends View {
    
    public MapMenuView(){
    
    }
    
   @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nMap Menu Prompt ");
        return inputs;
    }

    
    @Override
     public boolean doAction(String[] inputs) {
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

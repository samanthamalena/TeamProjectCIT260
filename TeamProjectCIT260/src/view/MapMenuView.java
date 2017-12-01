/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Game;
import model.Location;
import teamprojectcit260.TeamProjectCIT260;


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
                this.displayMap();
                break;
            case "I":
                this.displayInfo();
                break;
            case "Q":
                break;
        }
        return true;
    }
   
    public void displayMap() {
        Game game = TeamProjectCIT260.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        System.out.println("title");
        int colNum = 1;
        for(int i = 0; i < game.getMap().getColumns(); i++){ 
            System.out.println(colNum);
            colNum++;
        }
        int rowNum = 1;
        for(int i = 0 ; i < game.getMap().getRows(); i++){
            System.out.println("--------------------------------\n");
            System.out.println(rowNum);
        }
    }
    public void displayInfo() {
    
    }
    
}

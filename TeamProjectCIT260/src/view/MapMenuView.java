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
        //Location[][] locations = game.getMap().getLocations();
        System.out.print("title\n");
        System.out.print("  ");
        int rows = game.getMap().getRows();
        int cols = game.getMap().getColumns();
        int colNum = 1;
        System.out.print("  ");
        for(int i = 0; i < cols; i++){ 
            System.out.print(colNum + "  ");
            colNum++;
        }
        System.out.print("\n");
        int rowNum = 1;
        for(int i = 0 ; i < rows ; i++){
            if( i < 9){
                for(int pr = 0; pr < cols * 4; pr++){
                    System.out.print("-");
                }
                System.out.print("\n");
                System.out.print(rowNum + " ");
                for (int h = 0; h < cols; h++){
                    System.out.print(" | ");
                }
                System.out.print("\n");
                rowNum++;
            }
            else {
                System.out.print("   --------------------------------\n");
                System.out.print(rowNum);
                for (int h = 0; h < cols; h++){
                    System.out.print(" | ");
                }
                System.out.print("\n");
                rowNum++;
            }
        }
    }
    
    
    public void displayInfo() {
    
    }
    
}

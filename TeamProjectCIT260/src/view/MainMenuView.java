/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import control.GameControl;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Samantha Hancock
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
    
    }

   @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nMain Menu \n Enter 'L' to load a previous game \n Enter 'N' to start a new game \n Enter 'H' for the Help Menu");
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "L":
                this.loadState();
                return false;
            case "N":
                this.newState();
                return false;
            case "H":
                this.helpMenu();
                return false;
            case "Q":
                break;
        }
        return true;
    }
    
    public void loadState() {
       LoadGameView pirates = new LoadGameView();
       pirates.display();
    }
    public void newState() {
        GameControl.createNewGame(TeamProjectCIT260.getCurrentPlayer());
        GameMenuView ahoy = new GameMenuView();
        ahoy.display();
    }
    public void helpMenu() {
        System.out.print("\nhelp menu!!!\n");
    }
    
}

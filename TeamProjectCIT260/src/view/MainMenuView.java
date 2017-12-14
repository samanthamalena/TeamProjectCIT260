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
       GameControl pirates = new GameControl();
       pirates.loadGames();
    }
    public void newState() {
        GameControl.createNewGame(TeamProjectCIT260.getCurrentPlayer());
        GameMenuView ahoy = new GameMenuView();
        ahoy.display();
    }
    public void helpMenu() {
        System.out.print("\nThis is the help menu.\n The objective of the game is to save survivors and to gather resources \n"
                + "If you are having troubles, toggle back and forth from the map to the number of resources you have. \n"
                + "Make sure that you do the mini game answers correctly. That way you can move to the next level. Whenver you\n"
                + "want to move back between maps use 'Q' to exit that menu and enter another one");
    }
    
}

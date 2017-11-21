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
        inputs[0] = this.getInput("\nMain menu Prompot ");
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "L":
                this.loadState();
                break;
            case "N":
                this.newState();
                break;
            case "H":
                this.helpMenu();
                break;
            case "Q":
                break;
        }
        return true;
    }
    
    public void loadState() {
    
    }
    public void newState() {
        GameControl.createNewGame(TeamProjectCIT260.getCurrentPlayer());
        
    }
    public void helpMenu() {
        HelpMenuView help = new HelpMenuView();
        help.display();
    }
    
}

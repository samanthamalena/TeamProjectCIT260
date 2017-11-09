/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import control.GameControl;
import model.Player;

/**
 *
 * @author Me
 */
public class StartProgramView extends View {
    
    public StartProgramView(){
    
    }
    @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nPlease enter your name: ");
        return inputs;
    }
    @Override
    public boolean doAction(String[] inputs) {
        String playerName = inputs[0];
        GameControl herp = new GameControl();
        Player player = herp.savePlayer(playerName);
        if (player == null){
            System.out.println("\nCould not create the player\nEnter a different name.");
            return false;
        }
        System.out.println("\n=====================================");
        System.out.println("\nWelcome to the game");
        System.out.println(playerName);
        System.out.println("\nWe hope you have a lot of fun!");
        System.out.println("\n=====================================");
        MainMenuView derp = new MainMenuView();
        derp.display();
        return true;
    }
    
    
}

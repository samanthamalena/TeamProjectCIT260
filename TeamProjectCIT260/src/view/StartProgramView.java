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
public class StartProgramView {
    
    public StartProgramView(){
    
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Me
 */
public class BuildBoatView {
    public BuildBoatView(){
        
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
        System.out.println("\n*****This Is The Boat menu*****");
        boolean valid = false;
        while (valid == false){
            System.out.println("\nEnter a command");
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
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "B":
                
                break;
            case "I":
                
                break;
            case "Q":
                break;
        }
        return true;
    }
}

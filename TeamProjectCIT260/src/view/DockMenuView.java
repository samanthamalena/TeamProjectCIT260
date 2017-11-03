/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author Samantha Hancock
 */
public class DockMenuView {
    
    public DockMenuView(){
    
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
        System.out.println("\n*****ThisIsTheDOCKmenu*****");
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

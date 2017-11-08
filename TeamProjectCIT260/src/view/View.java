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
public abstract class View implements ViewInterface {
    public View(){    
    }
    @Override
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
    @Override
    public String getInput(String promptMessage){
        String userInput = null;
        Scanner infile = new Scanner(System.in);
        boolean valid = false;
        while (valid == false){
            System.out.println(promptMessage);
            userInput = infile.nextLine();
            userInput.trim();
            if (userInput.length() < 1){
                System.out.println("\nyou must enter a value");
            }
            else{
                break;
            }
            
        }
        return userInput;
    }
}

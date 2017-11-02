/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.floood.view;
import java.util.Scanner;

/**
 *
 * @author Samantha Hancock
 */
public class GameMenuView {
    
    public GameMenuView(){
    
    }
    
    public void displayGameMenuView(){
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
        Scanner infile = new Scanner(System.in);
        String[] inputs = new String[1];
        System.out.println("\nL - Load State\nN - New State\nH - Help Menu\nQ - Exit");
        boolean valid = false;
        do{
            System.out.println("\n\nEnter one of the options");
            inputs[0] = infile.nextLine();
            if (inputs[0].length() > 0)
                valid = true;
                
        }
        while(valid == false);
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        return true;
    }
    
    
}

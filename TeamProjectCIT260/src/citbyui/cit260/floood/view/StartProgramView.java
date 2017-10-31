/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.floood.view;
import java.util.Scanner;

/**
 *
 * @author Me
 */
public class StartProgramView {
    
    public StartProgramView(){
    
    }
    
    public void displayStartProgramView(){
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
    
    public void displayDescription(){
        System.out.println("This is the game description");
    }
    public void displayStartMenu(){
        System.out.println("s - Load State\nn - New State\nh - Help Menu\ne - Exit");
        
    }
    public String[] getInputs(){
        Scanner infile = new Scanner(System.in);
        String[] inputs = new String[1];
        this.displayDescription();
        boolean valid = false;
        do{
            System.out.println("Enter the Player's name");
            inputs[0] = infile.nextLine();
            if (inputs[0].length() > 2)
                valid = true;
                
        }
        while(valid == false);
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

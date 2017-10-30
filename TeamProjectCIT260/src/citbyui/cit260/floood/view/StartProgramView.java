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
    public StartProgramView(){}
    public void displayDescription(){
        System.out.println("This is the game description");
    }
    public void displayStartMenu(){
        System.out.println("s - Load State\nn - New State\nh - Help Menu\ne - Exit");
        
    }
    public String getInputs(){
        Scanner infile = new Scanner(System.in);
        String input = "";
        while(input.length() < 2){
            input = infile.nextLine();
        }
        return input;
    }
    
    
}

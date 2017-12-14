/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.EquationControl;
import java.util.Scanner;
import control.GameControl;
import control.ResourceControl;
import static java.lang.Integer.parseInt;
import model.Question;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Samantha Hancock
 */
public class MiniGameView extends View {
    
    public MiniGameView(){
    
    }

   @Override
    public String[] getInputs(){
        String inputs[] = new String[2];
        System.out.print("\nQuestionTime!!!!!!!!!!\n");
        EquationControl ec = new EquationControl();
        Question question = ec.createQuestion();
        System.out.print(question.getQuestion());
        inputs[0] = this.getInput("\nAnswer this question right to build a boat and enter the next level!!!!");
        inputs[1] = String.valueOf(question.getAnswer());
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.trim();
        double answer = Double.parseDouble(menuItem);
        double rightAnswer = Double.parseDouble(inputs[1]);
        
        if(answer == rightAnswer){
            ResourceControl rc = new ResourceControl();
            rc.upgradeMap();
        }
        else {
            System.out.print("\nSorry but thats wrong!!!!!!!\n");
        }
        return true;
    }
    
    
}

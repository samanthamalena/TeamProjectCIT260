/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import control.MapControl;
import exception.GameControlException;
import exception.MapControlException;
import model.Game;
import model.Location;
import teamprojectcit260.TeamProjectCIT260;


/**
 *
 * @author Samantha Hancock
 */
public class LoadGameView extends View {
    
    public LoadGameView(){
    
    }
    
   @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nThis is the Load menu\n");
        return inputs;
    }

    
    @Override
     public boolean doAction(String[] inputs) {
            GameControl gc = new GameControl();
            gc.loadGames();
        return true;
    }
   
    
    

    
    
}
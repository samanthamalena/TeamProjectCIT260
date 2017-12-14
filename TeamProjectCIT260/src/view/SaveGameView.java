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
public class SaveGameView extends View {
    
    public SaveGameView(){
    
    }
    
   @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nThis is the Save menu\n ");
        return inputs;
    }

    
    @Override
     public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Game game = TeamProjectCIT260.getCurrentGame();
        try{
            GameControl gc = new GameControl();
            gc.saveGames(game);
        }
        catch(GameControlException e){
            System.out.print(e.getMessage());
        }
        return true;
    }
   
    
    

    
    
}

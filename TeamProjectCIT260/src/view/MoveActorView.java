/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import exception.MapControlException;
import static java.lang.Integer.parseInt;
import model.Actor;
import model.Player;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Me
 */
public class MoveActorView extends View {

    @Override
    public String[] getInputs() {
        String inputs[] = new String[2];
        inputs[0] = this.getInput("Which way do you want to go?? Enter row number ");
        inputs[1] = this.getInput("Now enter the column number");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        Actor actor = TeamProjectCIT260.getCurrentGame().getPlayer().getActor();
        try {
            int r = parseInt(row);
            int c = parseInt(column);
            try {
                MapControl mc = new MapControl();
                mc.moveActor(actor, r, c);
            }
            catch (MapControlException e){
                System.out.print("Must be in the bounds of the map!!!!!");
            }
        }   
        catch (NumberFormatException e){
            System.out.print("The row and column must be a number!!!");
            return false;
        }
        
        return true;
    }
    
}

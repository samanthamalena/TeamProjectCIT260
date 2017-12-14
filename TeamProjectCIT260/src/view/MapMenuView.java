/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import exception.MapControlException;
import model.Game;
import model.Location;
import teamprojectcit260.TeamProjectCIT260;


/**
 *
 * @author Samantha Hancock
 */
public class MapMenuView extends View {
    
    public MapMenuView(){
    
    }
    
   @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nMap Menu Prompt\n E - display map\n M - move Actor\n Q - quit\n ");
        return inputs;
    }

    
    @Override
     public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        menuItem = menuItem.trim();
        switch (menuItem){
            case "E":
                try{
                    MapControl mapC = new MapControl();
                    mapC.displayMap();
                }
                catch(MapControlException e){
                  System.out.print("didn't work");      
                }    
                return false;
            case "M":
                MoveActorView mA = new MoveActorView();
                mA.display();
                return false;
            case "Q":
                break;
        }
        return true;
    }
   
    
    

    
    
}

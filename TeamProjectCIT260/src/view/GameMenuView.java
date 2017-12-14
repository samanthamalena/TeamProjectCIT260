/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import control.MapControl;
import control.ResourceControl;
import model.Game;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Samantha Hancock
 */
public class GameMenuView extends View {

    public GameMenuView() {
    }
    
    @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nGame Menu \n T - build a bigger boat\n M - map menu\n B - view boat resources\n S - save game\n Q - quit");
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        menuItem = menuItem.trim();
        switch (menuItem){
            case "M":
                this.viewMap();
                return false;
            case "B":
                this.viewBoat();
                return false;
            case "T":
                if(TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getColumn() == 0 && 
                   TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getRow() == 0){
                    ResourceControl rc = new ResourceControl();
                    if(rc.canBuild()){
                        MiniGameView mv = new MiniGameView();
                        mv.display();
                    }
                }
                else {
                    System.out.print("YOU NEED TO BE AT THE DOCK TO DO THAT!!!!!!");
                }
                return false;
            case "S":
                saveGame();
                return false;
            case "Q":  
                break;
        }
        return true;
    }


    private void viewMap() {
        MapMenuView derphead = new MapMenuView();
        derphead.display();
    }

    private void viewBoat() {
        if(TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getColumn() == 0 && 
           TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getRow() == 0){
            ResourceControl rc = new ResourceControl();
            rc.displayResources();
        }
        else {
            System.out.print("YOU NEED TO BE AT THE DOCK TO DO THAT!!!!!!");
        }
    }

    private void saveGame() {
       if(TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getColumn() == 0 && 
           TeamProjectCIT260.getCurrentGame().getPlayer().getActor().getLocation().getRow() == 0){
           GameControl gc = new GameControl();
           gc.saveGames();
       }
    }
}

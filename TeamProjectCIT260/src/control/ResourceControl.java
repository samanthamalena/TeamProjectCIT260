/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Game;
import model.Map;
import model.Resource;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Me
 */
public class ResourceControl {

    public ResourceControl() {
    }
    
    
    public void displayResources() {
        int gallons = 0;
        int survivors = 0;
        int food = 0;
        for (Resource r : TeamProjectCIT260.getCurrentGame().getPlayer().getResources()){
            if(r.getName() == "gas"){
                gallons++;
            }
            else if (r.getName() == "survivor"){
                survivors++;
            }
            else if(r.getName() == "food"){
                food++;
            }
        }
        System.out.print("\nYou have found " + survivors + " survivors!!!\nYou have found "
                        + gallons + " gallons of gas!!!\nYou have found " + food + " first aid and food packs!!!\n" );
    }

    public boolean canBuild() {
        Game game = TeamProjectCIT260.getCurrentGame();
        if (getNumberOf("gas") < game.getLevel() + 1 || getNumberOf("survivor") < game.getLevel() + 2 || getNumberOf("food") < game.getLevel()){
            System.out.print("\nYOU DON'T HAVE ENOUGH RESOURCES TO BUILD A BIGGER BOAT!!!!\n");
            return false;
        }
        return true;
    }

    public void upgradeMap() {
        Game game = TeamProjectCIT260.getCurrentGame();
        int nLevel = game.getLevel() + 1;
        TeamProjectCIT260.getCurrentGame().setLevel(nLevel);
        int r = game.getMap().getRows() + 1;
        int c = game.getMap().getColumns() + 1;
        GameControl gc = new GameControl();
        Map nMap = gc.createMap(r,c);
        game.setMap(nMap);
        game.getPlayer().getActor().getLocation().setRow(0);
        game.getPlayer().getActor().getLocation().setColumn(0);
        System.out.print("\nCongrats on reaching the next level!!!!!!!\nNow you can save even more people!!!!!\n");
    }
    
    public int getNumberOf(String s){
        int total = 0;
        for (Resource r : TeamProjectCIT260.getCurrentGame().getPlayer().getResources()){ 
            if (r.getName() == s){
                total++;
            }
        }
        return total;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.MapControlException;
import model.Actor;
import model.Game;
import model.Location;
import model.Map;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Me
 */
public class MapControl {
    public void displayMap() throws MapControlException {
        Game game = TeamProjectCIT260.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        if(locations == null){
            throw new MapControlException("There r no Locations!!!!");
        }
        System.out.print("\nMap of The Flooded Town\n\n");
        int rows = game.getMap().getRows();
        int cols = game.getMap().getColumns();
        System.out.print("   ");
        
        // print column numbers
        for(int i = 0; i < cols; i++){ 
            System.out.print(i + "   ");
        }
        
        System.out.print("\n");
        
        
        for(int i = 0 ; i < rows ; i++){
            
            //print line divider
            System.out.print("  ");
            for(int pr = 0; pr < cols * 4; pr++){
                System.out.print("-");
            }
            ////////////
            
            
            System.out.print("\n");
            System.out.print(i + " ");
            for (int h = 0; h < cols; h++){
                    System.out.print(symbolRep(game.getMap().getLocations()[i][h], game));
                    System.out.print("|");
            }
            System.out.print("\n");
        }
    }
    
    
    private String symbolRep(Location location, Game game) {
        String sym = "";
        
        if (game.getPlayer().getActor().getLocation().getColumn() == location.getColumn() &&
                 game.getPlayer().getActor().getLocation().getRow() == location.getRow()){
            sym = " P ";
            location.setVisited(true);
        }
        else if (location.getVisited() == false){
            sym = "???";
        }
        else 
            System.out.print(location.getScene().getSymbol());
        return sym;
    }
    
    public boolean moveActor(Actor actor, int nRow, int nColumn) throws MapControlException {
        
        if (actor == null){
            throw new MapControlException("the actor is Null!!!!");
        }
        Game game = TeamProjectCIT260.getCurrentGame();
        Map map = game.getMap();
        int currentRow = actor.getLocation().getRow();
        int currentColumn = actor.getLocation().getColumn();
        Location newL = new Location();
        newL.setColumn(nColumn);
        newL.setRow(nRow);
        game.getPlayer().getActor().setLocation(newL);
        
        return true;
    }
  
}

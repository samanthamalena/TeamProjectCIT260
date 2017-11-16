/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;
import teamprojectcit260.TeamProjectCIT260;

/**
 *
 * @author Me
 */
public class GameControl {

    public GameControl(){
    }
    public Player savePlayer(String playerName){
        if(playerName.length() < 1 || playerName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playerName);
        
        return player;
    }
    
    
    public static int createNewGame(Player player){
        if (player == null){
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        TeamProjectCIT260.setCurrentGame(game);
        Actor[] actors = GameControl.createActors();
        game.setActors(actors);
        Map map = createMap(1,1);
        if (map == null){
            return -1;
        }
        
        game.setMap(map);
        return 1;
    }
    
    private static Actor[] createActors() {
        Actor[] actors = new Actor[10];
        actors[0].setName("Derp Head");
        actors[1].setName("Derp Head Jr.");
        return actors;
    }
    
    private static Map createMap(int numRows, int numColumns) {
        Map map = new Map();
        return map;
    }

}

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
        if (numRows < 0 || numColumns < 0) {
            return null;
        }
        Map map = new Map();
        map.setRows(numRows);
        map.setColumns(numColumns);
        Location[][] locations = createLocations(numRows, numColumns);
        map.setLocations(locations);
        Scene[] scenes = createScene();
        Question[] questions = createQuestions();
        assignQuestionsToScenes(questions, scenes);
        assignScenesToLocations(scenes, locations);
        return map;
    }

     private static Location[][] createLocations(int numRows, int numColumns) {
         if(numRows < 1 || numColumns <1)
             return null;
         Location[][] locations = (numRows, numColumns);

    }
     private static Question[] createQuestions() {
    }

     private static Scene[] createScene() {
    }
     private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
         
     }
     private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
         
     }
    
}

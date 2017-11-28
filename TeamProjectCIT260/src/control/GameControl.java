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

    private static Resource[] createResources() {
        return null;
    }

   
    public GameControl(){
    }
    
    public static Player savePlayer(String playerName){
        if(playerName.length() < 1 || playerName == null){
            return null;
        }
        Player player = new Player();
        player.setName(playerName);
        
        TeamProjectCIT260.setCurrentPlayer(player);
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
        Resource[] resources = GameControl.createResources();
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
        Scene[] scenes = createScenes();
        Question[] questions = createQuestions();
        assignQuestionsToScenes(questions, scenes);
        assignScenesToLocations(scenes, locations);
        return map;
    }

     private static Location[][] createLocations(int numRows, int numColumns) {
         if(numRows < 1 || numColumns <1)
             return null;
         Location[][] locations = new Location[numRows][numColumns];
         for (int i = 0; i < numRows; i++ ){
           for (int k = 0; k < numColumns; i++) {
               locations[i][k] = new Location();
               locations[i][k].setRow(i);
               locations[i][k].setColumn(k);
               locations[i][k].setVisited(false);
           } 
         }
                return locations;
    }
     private static Question[] createQuestions() {
         Question[] question = new Question[2];
         question[0].setAnswer("");
         question[0].setQuestion("");
         question[1].setAnswer("");
         question[1].setQuestion("");
         question[2].setAnswer("");
         question[2].setQuestion("");
         return question;
     }
     private static Scene[] createScenes() {
        Scene[] scenes = new Scene[2];
        scenes[0].setDescription("");
        scenes[0].setBlocked(false);
        scenes[0].setSymbol("");
        scenes[1].setDescription("");
        scenes[1].setBlocked(false);
        scenes[1].setSymbol("");
        scenes[2].setDescription("");
        scenes[2].setBlocked(false);
        scenes[2].setSymbol("");
        return scenes;
    }
     private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
         for (int i = 0; i < questions.length; i++){
             scenes[i].setQuestion(questions[i]);
         }
         
     }
     private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
         locations[0][0].setScene(new Scene());
         locations[0][1].setScene(new Scene());
         locations[0][2].setScene(new Scene());
         locations[1][0].setScene(new Scene());
         locations[1][1].setScene(new Scene());
         locations[1][2].setScene(new Scene());
         locations[2][0].setScene(new Scene());
         locations[2][1].setScene(new Scene());
         locations[2][2].setScene(new Scene());
         
     }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import teamprojectcit260.TeamProjectCIT260;
import java.util.ArrayList;
/**
 *
 * @author Me
 */
public class GameControl {

    private static Resource[] createResources() {
        return null;
    }

    public GameControl() {
    }

    public static Player savePlayer(String playerName) {
        if (playerName.length() < 1 || playerName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playerName);

        TeamProjectCIT260.setCurrentPlayer(player);
        return player;
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        TeamProjectCIT260.setCurrentGame(game);
        Actor[] actors = GameControl.createActors();
        game.setActors(actors);
        Resource[] resources = GameControl.createResources();
        Map map = createMap(5, 5);
        if (map == null) {
            return -1;
        }

        game.setMap(map);
        return 1;
    }

    private static Actor[] createActors() {
        Actor[] actors = new Actor[10];

        for (int i = 0; i < actors.length; i++) {
            actors[i] = new Actor();
        }
        actors[0].setName("Derp Head");
        actors[1].setName("Derp Head Jr.");
        return actors;
    }

    private static Map createMap(int numRows, int numColumns) {
        if (numRows < 1 || numColumns < 1) {
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
        if (numRows < 1 || numColumns < 1) {
            return null;
        }
        Location[][] locations = new Location[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numColumns; k++) {
                locations[i][k] = new Location();
                locations[i][k].setRow(i);
                locations[i][k].setColumn(k);
                locations[i][k].setVisited(false);
            }
        }
        return locations;
    }

    private static Question[] createQuestions() {
        Question[] questions = new Question[2];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new Question();
        }
        questions[0].setAnswer("");
        questions[0].setQuestion("");
        questions[1].setAnswer("");
        questions[1].setQuestion("");
        return questions;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[2];
        for (int i = 0; i < scenes.length; i++) {
            scenes[i] = new Scene();
        }
        return scenes;
    }

    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        for (int i = 0; i < questions.length; i++) {
            scenes[i].setQuestion(questions[i]);
        }

    }

    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        locations[0][0].setScene(scenes[0]);
    }
    
    private static void resourceSort(ArrayList<Resource> resources){
        for (Resource items : resources)
        {
           alphaSort(items, items);
        }
    }
     private static Resource alphaSort(Resource one, Resource two){
         char cow = one.getName().charAt(0);
         char pig = two.getName().charAt(0);
         if (cow > pig){
             return one;
         }
         else 
             return two;
     }
    
    
}

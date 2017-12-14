/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.lang.Math.random;
import model.*;
import teamprojectcit260.TeamProjectCIT260;
import java.util.ArrayList;
/**
 *
 * @author Me
 */
public class GameControl {

    private static Resource[] createResources() {
        Resource[] resources = new Resource[10];
        for (int i = 0; i < resources.length; i++) {
            resources[i] = new Resource();
        }
        return resources;
    }

    private static Resource resourceRandom() {
        double digit = random();
        Resource resource = new Resource();
        if (digit < 0.33){
            resource.setDescription("some gasoline");
            resource.setName("gas");
        }
        else if (digit < 0.66){
            resource.setDescription("a survivor");
            resource.setName("survivor");
        }
        else{
            resource.setDescription("some food and first aid supplies");
            resource.setName("food");
        }
        return resource;
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
        game.getPlayer().setActor(actors[0]);
        Resource[] resources = GameControl.createResources();
        game.setResources(resources);
        player.getActor().setLocation(new Location());
        player.getActor().getLocation().setRow(0);
        player.getActor().getLocation().setColumn(0);
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

    static Map createMap(int numRows, int numColumns) {
        if (numRows < 1 || numColumns < 1) {
            return null;
        }
        Map map = new Map();
        map.setRows(numRows);
        map.setColumns(numColumns);
        Location[][] locations = createLocations(numRows, numColumns);
        map.setLocations(locations);
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
                locations[i][k].setScene(randomizer());
                locations[i][k].setRow(i);
                locations[i][k].setColumn(k);
                locations[i][k].setVisited(false);
            }
        }
        locations[0][0].setScene(new DockScene());
        locations[0][0].setVisited(true);
        return locations;
    }


     
     private static Scene randomizer() {
        Scene scene = new Scene();
        double digit = random();
        if (digit > 0.5){
            scene = new BuildingScene();
            scene.setIsBuilding(true);
            scene.setResource(resourceRandom());
        }
        else {
            scene = new WaterScene();
            scene.setIsBuilding(false);
        }
        return scene;
     }

    public void saveGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void loadGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private int howManyBuildingsFound(){
        Game gameOne = TeamProjectCIT260.getCurrentGame();
        Location locations[][] = gameOne.getMap().getLocations();
        
        return -1;
    }
             
             
             
 }

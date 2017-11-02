/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.control;
import model.Player;

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
}

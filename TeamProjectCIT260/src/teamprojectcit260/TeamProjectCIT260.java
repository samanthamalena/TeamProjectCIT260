/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprojectcit260;

import view.*;
import control.*;
import model.*;


/**
 *
 * @author derpHead
 */
public class TeamProjectCIT260 {
    
    private static Game currentGame = null;
    private static Player currentPlayer;
////////////////////////////////////////////////////
    public static void main(String[] args) {
        StartProgramView derp = new StartProgramView();
        derp.display();
    }
/////////////////////////////////////////////////////
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TeamProjectCIT260.currentGame = currentGame;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        TeamProjectCIT260.currentPlayer = currentPlayer;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprojectcit260;

import view.*;
import control.*;
import exception.GameControlException;
import java.io.*;
import model.*;


/**
 *
 * @author derpHead
 */
public class TeamProjectCIT260 {
    
    private static Game currentGame = null;
    private static Player currentPlayer;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        try {
            TeamProjectCIT260.inFile = new BufferedReader(new InputStreamReader(System.in));
            TeamProjectCIT260.outFile = new PrintWriter(System.out, true);
            
            
            StartProgramView derp = new StartProgramView();
            derp.display(); 
        }
        catch(IOException e){
            System.out.print("Exception: " + e.toString() +
                             "\nCause: " + e.getCause() +
                             "\nMessage: " + e.getMessage());
        }
        finally {
            TeamProjectCIT260.inFile.close();
            TeamProjectCIT260.outFile.close();
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TeamProjectCIT260.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TeamProjectCIT260.inFile = inFile;
    }
    
    
    
}

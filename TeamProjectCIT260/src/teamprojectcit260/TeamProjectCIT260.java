/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprojectcit260;

import model.Player;
import citbyui.cit260.floood.view.StartProgramView;

/**
 *
 * @author SamanthaMalena
 */
public class TeamProjectCIT260 {

    /*f*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView derp = new StartProgramView();
        derp.displayDescription();
        System.out.println("Enter s to continue");
        String input = derp.getInputs();
        
    }
    
}

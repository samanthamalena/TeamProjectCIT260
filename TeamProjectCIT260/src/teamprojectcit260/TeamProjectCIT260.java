/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamprojectcit260;

import view.StartProgramView;
import view.MainMenuView;
import control.EquationControl;


/**
 *
 * @author derpHead
 */
public class TeamProjectCIT260 {

    /*f*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //StartProgramView derp = new StartProgramView();
        //derp.display();
        int base = 10;
        int height = 20;
        EquationControl yerp = new EquationControl();
        System.out.println(yerp.calcSurfaceArea(base, height));
        
    }
    
}

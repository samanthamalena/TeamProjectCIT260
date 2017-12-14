/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SamanthaMalena
 */
public class DockScene extends Scene{

    public DockScene() {
        setSymbol("(D)");
        setMessage("\nThis is the Dock. Here You can save your"
                           + " game and see your resources, If you have enough,"
                           + " then you can build a bigger boat and move on to"
                           + " the next level\n");
    }

  

    
}

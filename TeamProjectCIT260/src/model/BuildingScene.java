/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author SamanthaMalena
 */
public class BuildingScene extends Scene{

    public BuildingScene() {
        setSymbol("(#)");
        setFoundMessage("\nYou successfully found a building!");
        setMessage("You already found this building STUPID HEAD!!!\n");
    }


}
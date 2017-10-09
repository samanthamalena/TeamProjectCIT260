/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Me
 */
public class Boat implements Serializable {
    private int survivors;
    private int parts;
    private ArrayList<MiniGame> miniGames = new ArrayList<MiniGame>();

    public Boat() {
    }

    public int getSurvivors() {
        return survivors;
    }

    public void setSurvivors(int survivors) {
        this.survivors = survivors;
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public ArrayList<MiniGame> getMiniGames() {
        return miniGames;
    }

    public void setMiniGames(ArrayList<MiniGame> miniGames) {
        this.miniGames = miniGames;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.survivors;
        hash = 59 * hash + this.parts;
        hash = 59 * hash + Objects.hashCode(this.miniGames);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boat other = (Boat) obj;
        if (this.survivors != other.survivors) {
            return false;
        }
        if (this.parts != other.parts) {
            return false;
        }
        if (!Objects.equals(this.miniGames, other.miniGames)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Boat{" + "survivors=" + survivors + ", parts=" + parts + ", miniGames=" + miniGames + '}';
    }
    
}

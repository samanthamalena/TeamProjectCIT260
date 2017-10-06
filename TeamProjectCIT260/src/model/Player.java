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
public class Player implements Serializable {
    private String name;
    private double lastDatePlayed;

    public Player() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.lastDatePlayed) ^ (Double.doubleToLongBits(this.lastDatePlayed) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.lastDatePlayed) != Double.doubleToLongBits(other.lastDatePlayed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestScore) != Double.doubleToLongBits(other.bestScore)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", lastDatePlayed=" + lastDatePlayed + ", bestScore=" + bestScore + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastDatePlayed(double lastDatePlayed) {
        this.lastDatePlayed = lastDatePlayed;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }

    public String getName() {
        return name;
    }

    public double getLastDatePlayed() {
        return lastDatePlayed;
    }

    public double getBestScore() {
        return bestScore;
    }
    private double bestScore;
    
}

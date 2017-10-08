/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author SamanthaMalena
 */
public class Player implements Serializable {
    private String name;
    private double lastDatePlayed;

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", lastDatePlayed=" + lastDatePlayed + ", actor=" + actor + ", games=" + games + ", bestScore=" + bestScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.lastDatePlayed) ^ (Double.doubleToLongBits(this.lastDatePlayed) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.actor);
        hash = 89 * hash + Objects.hashCode(this.games);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
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
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        return Objects.equals(this.games, other.games);
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public Actor getActor() {
        return actor;
    }

    public ArrayList<Game> getGames() {
        return games;
    }
    private Actor actor;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
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

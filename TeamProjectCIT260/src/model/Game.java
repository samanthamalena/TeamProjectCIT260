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
 * @author Me
 */
public class Game implements Serializable {
    private double totalTime;
    private Map map;
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public Game() {
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public Map getMap() {
        return map;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.map);
        hash = 67 * hash + Objects.hashCode(this.players);
        hash = 67 * hash + Objects.hashCode(this.actors);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.players, other.players)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", map=" + map + ", players=" + players + ", actors=" + actors + '}';
    }

    
}

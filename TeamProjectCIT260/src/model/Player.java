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
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    public Actor getActor() {
        return actor;
    }

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

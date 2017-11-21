/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Me
 */
public class BuildingScene implements Serializable {
    private int numberOfSurvivors;
    private int numberOfResources;
    private Resource[] resources;

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

    public BuildingScene() {
    }

    @Override
    public String toString() {
        return "BuildingScene{" + "numberOfSurvivors=" + numberOfSurvivors + ", numberOfResources=" + numberOfResources + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.numberOfSurvivors;
        hash = 79 * hash + this.numberOfResources;
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
        final BuildingScene other = (BuildingScene) obj;
        if (this.numberOfSurvivors != other.numberOfSurvivors) {
            return false;
        }
        if (this.numberOfResources != other.numberOfResources) {
            return false;
        }
        return true;
    }

    public int getNumberOfSurvivors() {
        return numberOfSurvivors;
    }

    public void setNumberOfSurvivors(int numberOfSurvivors) {
        this.numberOfSurvivors = numberOfSurvivors;
    }

    public int getNumberOfResources() {
        return numberOfResources;
    }

    public void setNumberOfResources(int numberOfResources) {
        this.numberOfResources = numberOfResources;
    }
}

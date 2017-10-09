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
public class Scene {
    private String description;
    private double blocked;
    private BuildingScene buildingScene;
    private DockScene dockScene;
    private ArrayList<Location> locations = new ArrayList<Location>();

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blocked=" + blocked + ", buildingScene=" + buildingScene + ", dockScene=" + dockScene + ", locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.blocked) ^ (Double.doubleToLongBits(this.blocked) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.buildingScene);
        hash = 29 * hash + Objects.hashCode(this.dockScene);
        hash = 29 * hash + Objects.hashCode(this.locations);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.blocked) != Double.doubleToLongBits(other.blocked)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.buildingScene, other.buildingScene)) {
            return false;
        }
        if (!Objects.equals(this.dockScene, other.dockScene)) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBlocked() {
        return blocked;
    }

    public void setBlocked(double blocked) {
        this.blocked = blocked;
    }

    public BuildingScene getBuildingScene() {
        return buildingScene;
    }

    public void setBuildingScene(BuildingScene buildingScene) {
        this.buildingScene = buildingScene;
    }

    public DockScene getDockScene() {
        return dockScene;
    }

    public void setDockScene(DockScene dockScene) {
        this.dockScene = dockScene;
    }

    public <any> getLocations() {
        return locations;
    }

    public void setLocations(<any> locations) {
        this.locations = locations;
    }
    
}

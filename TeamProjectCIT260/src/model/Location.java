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
public class Location {
    private double locationType;
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private Scence scene;
    private Map map;

    @Override
    public String toString() {
        return "Location{" + "locationType=" + locationType + ", actors=" + actors + ", scene=" + scene + ", map=" + map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationType) ^ (Double.doubleToLongBits(this.locationType) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.actors);
        hash = 97 * hash + Objects.hashCode(this.scene);
        hash = 97 * hash + Objects.hashCode(this.map);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.locationType) != Double.doubleToLongBits(other.locationType)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    public Location() {
    }

    public Scence getScene() {
        return scene;
    }

    public void setScene(Scence scene) {
        this.scene = scene;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public double getLocationType() {
        return locationType;
    }

    public void setLocationType(double locationType) {
        this.locationType = locationType;
    }

    public <any> getActors() {
        return actors;
    }

    public void setActors(<any> actors) {
        this.actors = actors;
    }

}

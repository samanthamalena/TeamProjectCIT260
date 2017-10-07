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
public class Map {
    private double rows;
    private double columns;
    private Game game;
    private Location location;

    @Override
    public String toString() {
        return "Map{" + "rows=" + rows + ", columns=" + columns + ", game=" + game + ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.rows) ^ (Double.doubleToLongBits(this.rows) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.columns) ^ (Double.doubleToLongBits(this.columns) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.game);
        hash = 71 * hash + Objects.hashCode(this.location);
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rows) != Double.doubleToLongBits(other.rows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columns) != Double.doubleToLongBits(other.columns)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    public Map() {
    }

    public double getRows() {
        return rows;
    }

    public void setRows(double rows) {
        this.rows = rows;
    }

    public double getColumns() {
        return columns;
    }

    public void setColumns(double columns) {
        this.columns = columns;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

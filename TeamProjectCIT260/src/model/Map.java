/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author SamanthaMalena
 */
public class Map {
    private int rows;
    private int columns;
    private Game game;
    private Location[][] locations;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.rows) ^ (Double.doubleToLongBits(this.rows) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.columns) ^ (Double.doubleToLongBits(this.columns) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.game);
        hash = 83 * hash + Arrays.deepHashCode(this.locations);
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
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rows=" + rows + ", columns=" + columns + ", game=" + game + ", locations=" + locations + '}';
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    
}

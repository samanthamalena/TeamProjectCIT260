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
public class DockScene {
    private ArrayList<Scene> scenes = new ArrayList<Scene>();
    private String exploreMap;
    private String boatMenu;
    private String saveMenu;

    public DockScene() {
    }

    @Override
    public String toString() {
        return "DockScene{" + "scenes=" + scenes + ", exploreMap=" + exploreMap + ", boatMenu=" + boatMenu + ", saveMenu=" + saveMenu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.scenes);
        hash = 31 * hash + Objects.hashCode(this.exploreMap);
        hash = 31 * hash + Objects.hashCode(this.boatMenu);
        hash = 31 * hash + Objects.hashCode(this.saveMenu);
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
        final DockScene other = (DockScene) obj;
        if (!Objects.equals(this.exploreMap, other.exploreMap)) {
            return false;
        }
        if (!Objects.equals(this.boatMenu, other.boatMenu)) {
            return false;
        }
        if (!Objects.equals(this.saveMenu, other.saveMenu)) {
            return false;
        }
        if (!Objects.equals(this.scenes, other.scenes)) {
            return false;
        }
        return true;
    }

    public ArrayList <Scene> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList <Scene> scenes) {
        this.scenes = scenes;
    }

    public String getExploreMap() {
        return exploreMap;
    }

    public void setExploreMap(String exploreMap) {
        this.exploreMap = exploreMap;
    }

    public String getBoatMenu() {
        return boatMenu;
    }

    public void setBoatMenu(String boatMenu) {
        this.boatMenu = boatMenu;
    }

    public String getSaveMenu() {
        return saveMenu;
    }

    public void setSaveMenu(String saveMenu) {
        this.saveMenu = saveMenu;
    }
}

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
    private String symbol;
    private String message;
    private String foundMessage;

    public Scene() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFoundMessage() {
        return foundMessage;
    }

    public void setFoundMessage(String foundMessage) {
        this.foundMessage = foundMessage;
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Samantha Hancock
 */
public class GameMenuView extends View {

    public GameMenuView() {
    }
    
    @Override
    public String[] getInputs(){
        String inputs[] = new String[1];
        inputs[0] = this.getInput("\nGame Menu \n M - map menu\n B - view boat resources\n L - view location\n S - save game\n Q - quit");
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        menuItem.trim();
        switch (menuItem){
            case "M":
                this.viewMap();
                return false;
            case "B":
                this.viewBoat();
                return false;
            case "L":
                this.viewLocation();
                return false;
            case "Q":
                
                break;
        }
        return true;
    }

    private void viewLocation() {
    }

    private void viewMap() {
        MapMenuView derphead = new MapMenuView();
        derphead.display();
    }

    private void viewBoat() {
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Planet;
import lostinspace.LostInSpace;

/**
 *
 * @author JacobsonKe
 */
public class MapView {
    
    public MapView() {                          
    }
    
    public void displayMap(){
        Game game = LostInSpace.getCurrentGame();
        Map map = game.getMap();
        Planet[] location = map.getLocation();
        
        for(int i=0; i < location.length; i++){
            System.out.println(
            "Planet " + location[i].getName() + ": "
            + location[i].getDesc());
        }
    }
}

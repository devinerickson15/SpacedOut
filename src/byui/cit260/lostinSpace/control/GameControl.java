/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.model.Player;
import lostinspace.LostInSpace;

/**
 *
 * @author Kevin
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        LostInSpace.setPlayer(player); // save the player
        
        return player;
    }
    
}

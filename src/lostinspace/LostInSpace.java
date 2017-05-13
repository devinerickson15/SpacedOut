/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;

import byui.cit260.lostinSpace.model.Actor;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Player;

/**
 *
 * @author devinerickson
 */
public class LostInSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Michael");
        playerOne.setHighScore(20000);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game bestPlayer = new Game();
        
        bestPlayer.setName("Scott");
        bestPlayer.setTotalTime(150);
        
        String topPlayer = bestPlayer.toString();
        System.out.println(topPlayer);
        
        Actor character = new Actor();
        
        character.setDescription("Space Dude");
        character.setLocation("Saturn");
        
        String person = character.toString();
        System.out.println(character);
        
        Map locate = new Map();
        
        locate.setCurrentLocation("Saturn");
        locate.setPreviousLocation("Jupiter");
        locate.setNextLocation("Moon");
        
        String playerLocate = locate.toString();
        System.out.println(playerLocate);
    }
    
}

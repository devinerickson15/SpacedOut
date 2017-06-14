/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;

import byui.cit260.lostinSpace.model.Actor;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Alien;
import byui.cit260.lostinSpace.model.Fuel;
import byui.cit260.lostinSpace.model.Inventory;
import byui.cit260.lostinSpace.model.RegularSceneType;
import byui.cit260.lostinSpace.model.Player;
import byui.cit260.lostinSpace.model.Planet;
import byui.cit260.lostinSpace.model.Puzzle;
import byui.cit260.lostinSpace.model.Weapon;

import byui.cit260.lostinSpace.view.StartProgramView;

/**
 *
 * @author devinerickson
 */
public class LostInSpace {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LostInSpace.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LostInSpace.player = player;
    }
    
    
    
    public static void main(String[] args) {
      
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.display();
    }
}

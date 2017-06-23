/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.model.Alien;
import byui.cit260.lostinSpace.model.Fuel;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Inventory;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Player;
import byui.cit260.lostinSpace.model.Weapon;
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

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        LostInSpace.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Weapon[] weaponList = GameControl.createWeaponList();
        game.setWeapon(weaponList);
        
        Fuel fuel = new Fuel();
        game.setFuel(fuel);
        
        Alien[] alienList = GameControl.createAlienList();
        game.setAlien(alienList);
        
        MapControl.movePlayersToStartingLocation(map);  
    }

    private static Inventory[] createInventoryList() {
        System.out.println("\n**** createInventoryList function called ***");
        return null; 
    }

    private static Weapon[] createWeaponList() {
        System.out.println("\n**** createWeaponList function called ***");
        return null; 
    }

    private static Alien[] createAlienList() {
        System.out.println("\n**** createAlienList function called ***");
        return null; 
    }
    
    
    
}

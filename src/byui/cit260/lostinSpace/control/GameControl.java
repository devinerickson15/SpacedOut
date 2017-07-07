/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.view.MainMenuView;
import byui.cit260.lostinSpace.exceptions.GameControlException;
import byui.cit260.lostinSpace.model.Alien;
import byui.cit260.lostinSpace.model.Fuel;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Inventory;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Player;
import byui.cit260.lostinSpace.model.Weapon;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        Inventory[] inventory = new Inventory[6];
        
        Inventory weapon1 = new Inventory();
        weapon1.setWeapons("Blow Gun");
        inventory[Item.blow.ordinal()] = weapon1;
        
        Inventory weapon2 = new Inventory();
        weapon2.setWeapons("Ray Gun");
        inventory[Item.ray.ordinal()] = weapon2;
        
        Inventory weapon3 = new Inventory();
        weapon3.setWeapons("Lava Shooter");
        inventory[Item.lava.ordinal()] = weapon3;
        
        //It flings poop
        Inventory weapon4 = new Inventory();
        weapon4.setWeapons("Poop Flinger");
        inventory[Item.poop.ordinal()] = weapon4;
        
        Inventory weapon5 = new Inventory();
        weapon5.setWeapons("Slingshot");
        inventory[Item.slingshot.ordinal()] = weapon5;
        
        Inventory weapon6 = new Inventory();
        weapon6.setWeapons("The Terminator");
        inventory[Item.terminator.ordinal()] = weapon6;
        
        return inventory; 
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
    
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void restoreExistingGame(String filePath) throws GameControlException {
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        LostInSpace.setCurrentGame(game);
    }
    
    public enum Item {
        blow,
        ray,
        lava,
        poop,
        slingshot,
        terminator;
    }

    private static Weapon[] createWeaponList() {
        System.out.println("\n**** createWeaponList function called ***");
        return null; 
    }

    private static Alien[] createAlienList() {
        System.out.println("\n**** createAlienList function called ***");
        return null; 
    }
    
    public static void createMap(Game game){
        Map map = MapControl.createMap();
        game.setMap(map);
    }
    
    
}

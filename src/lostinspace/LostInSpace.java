/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;


import byui.cit260.lostinSpace.model.Actor;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Map;

import byui.cit260.lostinSpace.model.Fuel;
import byui.cit260.lostinSpace.model.Inventory;

import byui.cit260.lostinSpace.model.Player;
import byui.cit260.lostinSpace.model.Planet;
import byui.cit260.lostinSpace.model.Puzzle;
import byui.cit260.lostinSpace.model.Weapon;

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
        
        //Initialize Inventory
        Inventory playerInventory = new Inventory();
        
        playerInventory.setRemainingFuel(7.54);
        playerInventory.setCurrentWeapon("Ray Gun");
        
        //Initialize Fuel
        Fuel gasoline = new Fuel();
        
        gasoline.setCollectFuel("Collecting fuel from a nearby pond, but beware, there could be an alien lurking near...");
        gasoline.setStoreFuel(7.54);
        
        //Initialize Weapon
        Weapon lazer = new Weapon();
        
        lazer.setWeaponName("Lazer Extreme");
        lazer.setWeaponDamage(24);
        
        //Initialize Puzzle
        Puzzle firstPuzzle = new Puzzle();
        
            firstPuzzle.setDifficulty("Easy");
            firstPuzzle.setSolution(256);
            firstPuzzle.setPuzzle(1);
        
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
            
        //Initialize Planet    
        Planet sphere = new Planet ();
        
            sphere.setName("Neptune");
            sphere.setDesc("round");
        
            String currentPlanet = sphere.toString();
            System.out.println(currentPlanet);
         //   
        Game bestPlayer = new Game();
        
            bestPlayer.setName("Scott");
            bestPlayer.setTotalTime(150);
        
            String topPlayer = bestPlayer.toString();
            System.out.println(topPlayer);
        //
        Actor character = new Actor();
        
            character.setDescription("Space Dude");
            character.setLocation("Saturn");
        
            String person = character.toString();
            System.out.println(character);
        //
        Map locate = new Map();
        
            locate.setCurrentLocation("Saturn");
            locate.setPreviousLocation("Jupiter");
            locate.setNextLocation("Moon");
        
            String playerLocate = locate.toString();
            System.out.println(playerLocate);

        //Test Inventory Class
        String inventoryInfo = playerInventory.toString();
        System.out.println(inventoryInfo);
        
        //Test Fuel Class
        String fuelInfo = gasoline.toString();
        System.out.println(fuelInfo);
        
        //Test Weapon Class
        String weaponInfo = lazer.toString();
        System.out.println(weaponInfo);
        
        //Test Puzzle Class
        String puzzleInfo = firstPuzzle.toString();
        System.out.println(puzzleInfo);

    }
    
    
}

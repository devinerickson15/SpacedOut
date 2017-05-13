/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;

import byui.cit260.lostinSpace.model.Fuel;
import byui.cit260.lostinSpace.model.Inventory;
import byui.cit260.lostinSpace.model.Player;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;


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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        LostInSpace.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        LostInSpace.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        LostInSpace.logFile = logFile;
    }
    
    
     
    public static void main(String[] args) {
        
        try {
            
            LostInSpace.inFile = new BufferedReader(new InputStreamReader(System.in));
            LostInSpace.outFile = new PrintWriter(System.out, true);
                   
            try {
            
                String filePath = "log.txt";
                LostInSpace.logFile = new PrintWriter(filePath);
              
            } catch (Exception e) {
                System.out.println("Exception: " + e.toString() +
                                   "\nCause: " + e.getCause() +
                                   "\nMessage: " + e.getMessage());
            }     
            
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.display();
    return;
    
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
                
        e.printStackTrace();;
    }
        
    finally {
            
        try {
            
            if (LostInSpace.inFile != null)
                LostInSpace.inFile.close();
            
            if (LostInSpace.outFile != null)
                LostInSpace.outFile.close();
            
            if (LostInSpace.logFile != null)
                LostInSpace.logFile.close();
            
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }

    
    }
}}

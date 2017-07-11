/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.GameControl;
import byui.cit260.lostinSpace.model.Game;
import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Planet;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeArray.map;
import lostinspace.LostInSpace;

/**
 *
 * @author Megan
 */
public class GameMenuView extends View{
    
    private String menu;
    
    public GameMenuView() {
               super("\n"
                  + "\n--------------------------------"
                  + "\n|          Game Menu               |"
                  + "\n--------------------------------"
                  + "\nL - Lift Off"
                  + "\nG - Gather Fuel"
                  + "\nF - View Fuel Percentage"
                  + "\nC - Current Weapon"
                  + "\nE - Engage Alien"
                  + "\nP - Solve A Puzzle"
                  + "\nS - Save Game"
                  + "\nM - Display Map"
                  + "\nR - Print Player Report"     
                  + "\nH - Help"
                  + "\nQ - Quit to Main Menu"
                  + "\n--------------------------------");           
    }

    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "L":
                this.startLiftOff();
                break;
            case "G":
                this.gatherFuel();
                break;
            case "F":
                this.viewFuelPercentage();
                break;
            case "C":
                this.currentWeapon();
                break;
            case "E":
                this.displayFightMenu();
                break;
            case "P":
                this.displayPuzzleMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "M":
                this.viewMap();
                break;
            case "R":
        {
            try {
                this.printPlayerReport();
            } catch (FileNotFoundException ex) {
                System.out.println("Error closing files");
                return false;
            }
        }
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        }

    private void startLiftOff() {
          
        //Display the Navigation menu 
        NavigationMenuView navMenuView = new NavigationMenuView();
        navMenuView.display();
    }

    private void gatherFuel() {
        
        //Display the fuel View
        FuelView fuelView = new FuelView();
        fuelView.display();
    }

    private void viewFuelPercentage() {
        
        //FuelPercentageView fuelPercView = new FuelPercentageView();
       // fuelPercView.displayDescription();
       
       FuelPercentMenuView fuelMenu = new FuelPercentMenuView();
       fuelMenu.display();
    }

    private void currentWeapon() {
        CurrentWeaponView weaponView = new CurrentWeaponView();
        weaponView.display();        
    }
    
    private void displayPuzzleMenu() {
        PuzzleMenuView puzzMenuView = new PuzzleMenuView();
        puzzMenuView.display();
    }

    private void saveGame() {
        
        this.console.println("\nEnter the file path for file where the game"
                           + " is to be saved.");
        String filePath = this.getInput();
        
        try {
            
            GameControl.saveGame(LostInSpace.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayFightMenu() {
        FightMenuView fightMenuView = new FightMenuView();
        fightMenuView.display();
    }

    private void viewMap() {
      MapView showMap = new MapView();
      showMap.displayMap();
    
    }

    private void printPlayerReport() throws FileNotFoundException {
            this.console.println("\n\n Enter the file path for the printed report.");
            
            String filePath = this.getInput();
            
            PrintWriter playerWriter = new PrintWriter("player.txt");
            try (PrintWriter out = new PrintWriter(filePath)) {
                
                Game game = LostInSpace.getCurrentGame();
                Map map = game.getMap();
                Planet[] location = map.getLocation();
                
                out.println();
                out.println("Player Loadout");
                out.println();
                out.println();
                out.println(String.format("Player", "Planet", "Description", "Time Elapsed"));
                out.println(String.format("Player", "----------","----------","----------"));
                
                for (Planet locations : location) {
                    out.println(String.format("Player", locations.getCurrentLocation(), locations.getDesc(), game.getTotalTime()));
                    out.flush();
                }
            }
    }
   
}

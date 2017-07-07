/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.GameControl;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;
import lostinspace.LostInSpace;

/**
 *
 * @author Megan
 */
public class MainMenuView extends View{
  
       public MainMenuView() {
                   super(  "\n"
                  + "\n--------------------------------"
                  + "\n|     Main Menu                |"
                  + "\n--------------------------------"
                  + "\nN - Start New Game"
                  + "\nR - Restore Existing Game"
                  + "\nS - Save Game"         
                  + "\nH - Get Help On How To Play The Game"
                  + "\nQ - Quit Game!"
                  + "\n--------------------------------");           
    }
    

     @Override        
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.restoreExistingGame();
                break;
            case "S":
                this.saveGame();
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

    private void startNewGame() {
        
        //Create a new game
        GameControl.createNewGame(LostInSpace.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void restoreExistingGame() {
       
        this.console.println("\nEnter the file path for file where the game "
                           + "was saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.restoreExistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.display();
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
    }
    
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.GameControl;
import byui.cit260.lostinSpace.model.Player;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author devinerickson, megan, keith
 */
public class StartProgramView extends View{
    
    private String promptMessage;
   
     public StartProgramView() {
        
       super("\nPlease enter your name: ");
        
       // display banner
       this.displayBanner();
        
    }
       private void displayBanner() {
        System.out.println(
                "\n***********************************************************"
            +   "\n* You awaken to find yourself on an unfamiliar  *"
            +   "\n* and barren planet, with intense winds and no   *"
            +   "\n* sign of life. As you look up to the night sky, you     *"
            +   "\n* observe 14 distant moons, some larger than *"
            +   "\n* others. Your spaceship has crashed and  you    *"
            +   "\n* have lost all communication with Earth. As you *"
            +   "\n* look out the window, you notice a shiny metal  *"
            +   "\n* box next to the spaceship. With you spacesuit  *"
            +   "\n* still intact, you open the door of the spaceship   *"
            +   "\n* and retrieves the metal box. Secured safely    *"
            +   "\n* within the box is a map, which provides you    *"
            +   "\n* with the first clue as you begin his journey   *"
            +   "\n* back to Earth. *"
            +   "\n*    *"
            +   "\n* Knowing you are a long way from home, you  *"
            +   "\n* desperately want to make it back to Earth  *"
            +   "\n* safely. The goal of the game is for the player *"
            +   "\n* to return to Earth safely by navigating your   *"
            +   "\n* way through space, fighting off dangerous  *"
            +   "\n* alien creatures, and collecting helpful clues  *"
            +   "\n* and resources as he stops at each of the   *"
            +   "\n* destinations along the way. You will need to   *"
            +   "\n* find the resources that will help him restore  *"
            +   "\n* the spaceship, gather the necessary fuel,  *"
            +   "\n* acquire weapons to fight aliens, and   *"
            +   "\n* eventually land the spaceship safely   *"
            +   "\n* back on Earth. *"
            +   "\n*    *"
            +   "\n* Good luck on your journey and safe travels!    *"
            );
    }

    
    @Override
    public boolean doAction(String playersName) {
        
        if(playersName.length() < 2) { 
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPalyer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {//if unsuccessful
                System.out.println("\nError creating the player.");
                return false;
        }
    //display next view
    this.displayNextView(player);
    
    return true; //success!
    }

    private void displayNextView(Player player) {
        
        // Display a custom welcome message
        System.out.println("\n==============================="
                        + "\n Welcome to the game" + " " + player.getName() + "!"
                        + "\n We hope you have a lot of fun!"
                        + "\n==============================="
                         );
                         
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.display();
        
        
    }
    
}

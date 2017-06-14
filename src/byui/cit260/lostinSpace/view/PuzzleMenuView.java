/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class PuzzleMenuView extends View{
      
     private String menu;
    
    public PuzzleMenuView() {
        super("\n"
                  + "\n--------------------------------"
                  + "|      Puzzle Menu                   |"
                  + "\n--------------------------------"
                  + "\nS - Solve A Puzzle"
                  + "\nM - Map"
                  + "\nH - Help"
                  + "\nQ - Exit"
                  + "\n--------------------------------");           
    }

     @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.displaySolvePuzzleView();
                break;
            case "M":
                this.startMap();
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

    private void displaySolvePuzzleView() {
               SolvePuzzleView solvePuzz = new SolvePuzzleView();
               solvePuzz.display();
    }

    private void startMap() {
               System.out.println("\n*** startMap() stub function called***");
    }
   

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayH();
    }  
}

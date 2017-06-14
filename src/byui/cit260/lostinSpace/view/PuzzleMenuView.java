/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class PuzzleMenuView {
      
     private String menu;
    
    public PuzzleMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "|      Puzzle Menu                   |"
                  + "\n--------------------------------"
                  + "\nS - Solve A Puzzle"
                  + "\nM - Map"
                  + "\nH - Help"
                  + "\nQ - Exit"
                  + "\n--------------------------------";           
    }
    
    public void displayPuzzleMenuView() {
      
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value =keyboard.nextLine();
            value =value.trim();
            if (value.length() < 1){
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        return value;
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.startPuzzle();
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

    private void startPuzzle() {
                System.out.println("\n*** startPuzzle() stub function called***");
    }

    private void startMap() {
               System.out.println("\n*** startMap() stub function called***");
    }
   

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }  
}

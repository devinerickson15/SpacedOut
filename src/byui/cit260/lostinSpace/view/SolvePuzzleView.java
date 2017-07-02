/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.PuzzleControl;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author devinerickson
 */
public class SolvePuzzleView extends View{
    
    private String promptMessage;

    public SolvePuzzleView() {
        
        super("");
               
        this.displayDescription();
       
    }
    
    private void displayDescription() {
        System.out.println("\n*******************************************************"
                +  "\nIn order to progress you will be required to solve a"
                +  "\npuzzle. Deduction skills will come in handy here."
                +  "\n "
                +  "\nYour job will be to guess different numbers.  "
                +  "\n Use the following as a guide to find the solution"
                +  "\n"
                +  "\n"
                +  "\nThe number you are trying to find will be between"
                +  "\n 1 and 100. Let's see how many guess it takes!"
                +  "\n"
                +  "\n               ---------Take Luck---------"
                +  "\n*******************************************************");
    }
        
    @Override
    public boolean doAction(String choice) {
        
        int puzzle = 0;
        
        String input = choice;
        
        try {
        puzzle = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                              +"\n Try again or enter Q to quit.");
        return false;}
        
        
        int check = PuzzleControl.solvePuzzle(puzzle);
        
            if(check == -1) {
                System.out.println("!!!***  Try using a number with the range given  ***!!!"
                                                + "\n-----Please try again------");
                return false;
            } 
            else if (check == 0) {
                System.out.println("Oops... your number is too high,"
                    + "\n-----Please try again------");
                return false;
            }
            else if(check == 1){
                System.out.println("Oops... your number is too low,"
                    + "\n-----Please try again------");
                return false;
            }
            
            this.displayNextView(check);
            
            return true;
        
        }

    private void displayNextView(int check) {
        
        System.out.println("\n###############################"
            + "\n| You have solved the puzzle! |"
            + "\n| Good Luck in your travels   |"
            + "\n###############################");
        }
        
    }

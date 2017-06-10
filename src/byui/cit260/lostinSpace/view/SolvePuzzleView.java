/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.util.Scanner;

/**
 *
 * @author devinerickson
 */
public class SolvePuzzleView {
    
    private String promptMessage;
    
    public SolvePuzzleView() {
        
        this.promptMessage = "\n Please give 3 numerical inputs, separated "
                + "                             \nby commas, in order to solve your puzzle.";
        
        this.displayDescription();
        
    }
    
    private void displayDescription() {
        System.out.println(
                    "\n*******************************************************"
                +  "\nIn order to progress you will be required to solve a"
                +  "\n mathmatical puzzle. You will be given the answer,  "
                +  "\nand your job will be to use three integers to arrive at "
                +  "\n the given number. Use the following as a guide to "
                +  "\nfinding the solution"
                +  "\n"
                +  "\nX=A+B*C"
                +  "\n"
                +  "\nWhere your inputs will be 'A','B', and 'C'."
                +  "\n"
                +  "\n---------Take Luck---------"
                +  "\n*******************************************************"
        );
    }
    
    public void displayPuzzleView() {
        
        boolean done = false;
        do {
            String userChoice = this.getUserInput();
            if(userChoice.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(userChoice);
            
        } while(!done);
    }
    
    private String getUserInput() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String userChoice) {
        return false;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

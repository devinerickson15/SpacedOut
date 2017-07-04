/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.exceptions.PuzzleControlException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author devinerickson
 */
public class PuzzleControl {
    
        static Random randomGenerator = new Random();
        static int puzzle = randomGenerator.nextInt(100) + 1;

    static public int solvePuzzle(int solution) throws PuzzleControlException{

 //Checks for invalid inputs
            if (solution > 100 || solution < 1){
                throw new PuzzleControlException("Invalid input! "
                        + "\nPlease enter a number between 1 and 100.");
            } 
        
   
        int guess = (1 + solution - 1);
        
  
           if (puzzle < guess){
               throw new PuzzleControlException("Oops... your number is too HIGH,"
                    + "\n-----Please try again------");
            }
           
           if (puzzle > guess){
               throw new PuzzleControlException("Oops... your number is too LOW,"
                    + "\n-----Please try again------");
           }
           /**else if(puzzle == guess){
               return 2;
           }*/
           
        return guess;
        }
    
}

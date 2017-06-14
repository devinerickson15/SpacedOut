/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author devinerickson
 */
public class PuzzleControl {
    
        static Random randomGenerator = new Random();
        static int puzzle = randomGenerator.nextInt(100) + 1;

    static public int solvePuzzle(int solution){

 //Checks for invalid inputs
            if (solution > 100 || solution < 1){
                return -1;
            } 
        
   
        int guess = (1 + solution - 1);
        
  
           if (puzzle < guess){
                return 0;
            }
           
           if (puzzle > guess){
               return 1;
           }
           else if(puzzle == guess){
               return 2;
           }
           
        return guess;
        }
    
}

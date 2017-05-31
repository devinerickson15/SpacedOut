/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import java.util.Random;

/**
 *
 * @author devinerickson
 */
public class PuzzleControl {
    
    public int solvePuzzle(int userInput1, int userInput2, int userInput3, int difficulty, int puzzle){
        
        difficulty = 1;
        
        Random rando = new Random();
        
        int newPuzzle = rando.nextInt(1000) + 1;
        newPuzzle = puzzle;
        
        int solution = (userInput1 + userInput2 + userInput3);
        
        if (solution == puzzle){
            return 1;
        }
        else {
            return -1;
        }
    
    
    }
    
}

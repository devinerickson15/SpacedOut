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
    
/*    private String prompInstruct;
    
    public PuzzleControl(){
        this.prompInstruct = "\n Please enter 3 number with a space between\n each (ie 1 34 5)"
   
        this.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
                }
    
    Scanner keyboard = new Scanner( System.in );
    
    String input = keyboard.nextLine();
    String[] numbersStr = input.split("");
    
    
    int[] numbers = new int[ numbersStr.length ];
    int i = 0;
    for ( i = 0; i < numberStr.length; i++)
    {
        number[i] = Integer.parseInt(numberStr[i]);
        System.out.print(numbers[i] + "nice");
    }
    System.ount.println(correctAnswer);
**/
    
    public int solvePuzzle(int userInput1, int userInput2, int userInput3,  int puzzle){
        
        
        Random rando = new Random();
        
        int newPuzzle = rando.nextInt(1000) + 1;
        newPuzzle = puzzle;
        
        int solution = ((userInput1 + userInput2) * userInput3);
        
        if (solution == puzzle){
            return solution;
        }
        else {
            return puzzle;
        }
    
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author devinerickson
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of solvePuzzle method, of class PuzzleControl.
     */
    @Test 
    public void testSolvePuzzle() {
        System.out.println("\tTest Case #1");
        int userInput1 = 1;
        int userInput2 = 14;
        int userInput3 = 2;
        int puzzle = 30;
        
        PuzzleControl instance = new PuzzleControl();
        
        int expResult = puzzle;
        int result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
        
        //**********Test Case 2********
       
        System.out.println("\tTest Case #2");
        
        userInput1 = 1;
        userInput2 = 1;
        userInput3 = 1;
        puzzle = 2;
        
        
        expResult = puzzle;
        result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
        
        //**********Test Case 3********
       
        System.out.println("\tTest Case #3");
        
        userInput1 = 25;
        userInput2 = 25;
        userInput3 = 2;
        puzzle = 100;
        
        
        expResult = puzzle;
        result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
        
        //**********Test Case 4********
       
        System.out.println("\tTest Case #4");
        
        userInput1 = 1;
        userInput2 = 1;
        userInput3 = 1;
        puzzle = 2;
        
        
        expResult = puzzle;
        result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
        
        //**********Test Case 5********
       
        System.out.println("\tTest Case #5");
        
        userInput1 = 1;
        userInput2 = 14;
        userInput3 = 2;
        puzzle = 30;
        
        
        expResult = puzzle;
        result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
    }
    
}

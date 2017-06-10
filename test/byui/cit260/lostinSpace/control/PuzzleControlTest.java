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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of solvePuzzle method, of class PuzzleControl.
     */
    @Test // 1
    public void testSolvePuzzle() {
        System.out.println("solvePuzzle add use three numbers that add up to 30");
        int userInput1 = 1;
        int userInput2 = 14;
        int userInput3 = 2;
        int puzzle = 30;
        PuzzleControl instance = new PuzzleControl();
        int expResult = puzzle;
        int result = instance.solvePuzzle(userInput1, userInput2, userInput3, puzzle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

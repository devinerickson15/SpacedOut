/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Copyright 2017 Kent Anderson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package byui.cit260.lostinSpace.control;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


/**
 * This class overrides java.util.Random in order to provide a
 * random number generator that can be used predictably in 
 * unit tests.
 * 
 * Seeds won't matter for this class, since we're producing
 * our own provided set of random numbers.
 * 
 * @author kanderson
 */

public class RandomMock extends Random {

    // This collection of integers holds the random number sources
    // we want to use.
    private final List<Double> nextSequence; 

    // This index keeps track of where we are in the list of values
    // provided.
    private int nextIndex;
   

    /**
     * Constructor. The constructor accepts a variable size list of integers
     * to be used in the random number calculations. 
     * @param sequence 
     */

    public RandomMock(double... sequence) {

        nextSequence = new ArrayList<>();
        
        setSequence(sequence);
    }

    /**
     * Replace the sequence of numbers used with a new sequence of numbers.
     * @param sequence 
     */

    public final void setSequence(double... sequence) {

        // Clean out any previous values.
        nextSequence.clear();

        // Add the new values to sequence.
        for (double i : sequence){

            nextSequence.add(i);
        }

        nextIndex = 0;
    }

    /**
     * Provide the next value in the sequence.
     * @param bits
     * @return 
     */

    private double nextInSequence(){

        // Return 0 if we have not been provided with 
        // anything.

        if (nextSequence.isEmpty()){

            return 0;
        }

        // Get the next item in the list.

        double nextValue = nextSequence.get(nextIndex);

        // Increment our counter so we get the next item in the list
        // the next time we're are called. Check to make sure we
        // wrap back to the first element when we've used all the
        // supplied numbers.

        nextIndex++;

        if (nextIndex >= nextSequence.size()){

            nextIndex = 0;
        }

        return nextValue;

    }

    /**
     * Override the boolean method.
     * @return 
     */

    @Override

    public boolean nextBoolean(){

        return ((int)nextInSequence()) % 2 != 0;

    }


    /**
     * Override the double method.
     * @return 
     */

    @Override

    public double nextDouble(){

        return nextInSequence();

    }

    /**
     * Override the float method.
     * @return 
     */

    @Override

    public float nextFloat(){

        return (float)nextInSequence();

    }


    /**
     * Override the int method.
     * @return 
     */

    @Override

    public int nextInt(){

        return (int)nextInSequence();

    }

    /**
     * Override the bounded int method.
     * @return 
     */

    @Override

    public int nextInt(int bound){

        return (int)nextInSequence();

    }

    /**
     * Override the long method.
     * @return 
     */

    @Override

    public long nextLong(){

        return (long)nextInSequence();

    }
}

/**
 *
 * @author Megan
 */
public class FuelControlTest {
    
    public FuelControlTest() {
    }

    /**
     * Test of gatherFuel method, of class FuelControl.
     */
    @Test
    public void testGatherFuel() {
        System.out.println("gatherFuel");
        
        //*****Test Case #1 ******************
        
        System.out.println("\tTest Case 1");
        
        //Input values for test case 
        int planetDepth = 15;
        int surfaceDensity = 7;
        int userInput = 8;
        
        FuelControl instance = new FuelControl();
        
        Random randomNumber = new Random(20);
        
        instance.setRandom(randomNumber);
        int expResult = 16; //expected output return value
        int result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
         //*****Test Case #2 ******************
        
        System.out.println("\tTest Case 2");
        
        //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 0;
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #3 ******************
        
        System.out.println("\tTest Case 3");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 20;
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #4 ******************
        
        System.out.println("\tTest Case 4");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 300;
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #5 ******************
        
        System.out.println("\tTest Case 5");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 1;
       
        expResult = 9; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #6 ******************
        
        System.out.println("\tTest Case 6");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 10;
       
        expResult = 18; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #7 ******************
        
        System.out.println("\tTest Case 7");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 9;
       
        expResult = 17; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
    }
    
}

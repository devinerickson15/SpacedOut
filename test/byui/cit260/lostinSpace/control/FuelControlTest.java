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
        int random = 5;
    
        FuelControl instance = new FuelControl();
        int expResult = 6; //expected output return value
        int result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
         //*****Test Case #2 ******************
        
        System.out.println("\tTest Case 2");
        
        //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 0;
       random = 5;
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #3 ******************
        
        System.out.println("\tTest Case 3");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 20;
       random = 5; 
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #4 ******************
        
        System.out.println("\tTest Case 4");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 300;
       random = 5;
       
        expResult = -1; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #5 ******************
        
        System.out.println("\tTest Case 5");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 1;
       random = 5; 
       
        expResult = 8; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #6 ******************
        
        System.out.println("\tTest Case 6");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 10;
       random = 5;
       
        expResult = 18; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
        
        //*****Test Case #7 ******************
        
        System.out.println("\tTest Case 7");
        
         //Input values for test case 
       planetDepth = 15;
       surfaceDensity = 7;
       userInput = 9;
       random = 5;
       
        expResult = 7; //expected output return value
        result = instance.gatherFuel(planetDepth, surfaceDensity, userInput);
        assertEquals(expResult, result);
    }
    
}

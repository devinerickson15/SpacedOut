/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of attackAlien method, of class ActorControl.
     */
    @Test
    public void testAttackAlien() {
        System.out.println("attackAlien");
        
        //********Test Case 1*********
        System.out.println("\tTest Case #1");
        
        //Input values for test case 1
        int damage = 5;
        int playerHp = 100;
        int alienHp = 20;
        int chanceToHit = 0;
        
        //create instance of ActorControl class
        ActorControl instance = new ActorControl();
        
        //call function to run test
        int expResult = 5; //expected output returned value
        int result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
       //*******Test Case 2********
        System.out.println("\tTest Case #2");
        
        //Input values for test case 2
        damage = 1;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = -1; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 3********
        System.out.println("\tTest Case #3");
        
         //Input values for test case 3
        damage = 10;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = -1; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 4********
        System.out.println("\tTest Case #4");
        
         //Input values for test case 4
        damage = 13;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = -1; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 5********
        System.out.println("\tTest Case #5");
        
         //Input values for test case 5
        damage = 3;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = 3; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 6********
        System.out.println("\tTest Case #6");
        
         //Input values for test case 6
        damage = 9;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = 9; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 7********
        System.out.println("\tTest Case #7");
        
         //Input values for test case 7
        damage = 8;
        playerHp = 100;
        alienHp = 20;
        chanceToHit = 0;
       
        expResult = 8; //expected output returned value
        
         //call function to run test
        result = instance.attackAlien(damage, playerHp, alienHp, chanceToHit);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        //*******Test Case 8********
        System.out.println("\tTest Case #8");
        
   
    }
    
}

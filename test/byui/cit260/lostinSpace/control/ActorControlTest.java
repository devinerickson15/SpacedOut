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
        
        int playerHp = 100;
        int alienHp = 20;
        int weakAttack = -5;
        int mediumAttack =12;
        int strongAttack =17;
        
        
        //create instance of ActorControl class
        ActorControl instance = new ActorControl();
        
        
        //Tried so many ways to control the random factor, but I couldn't figure it out. I did test it the unprofessional long way though.
        //RandomMock random = new RandomMock(3,26,55,79,-1);
        //ActorControl.getRandom(opportunity);
        
        //call function to run test
        int expResult = -1; //expected output returned value
        int result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
       
        System.out.println("\tTest Case #2");
        
        //Input values for test case 2
        
        playerHp = 100;
        alienHp = 20;
        weakAttack = 5;
        mediumAttack =12;
        strongAttack =25;
        
        //create instance of ActorControl class
        /*ActorControl instance = new ActorControl();*/
            
        //call function to run test
        expResult = -1; //expected output returned value
        result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #3");
        
        //Input values for test case 2
        
        playerHp = 100;
        alienHp = 20;
        weakAttack = 5;
        mediumAttack =12;
        strongAttack =17;
        
        //create instance of ActorControl class
        /*ActorControl instance = new ActorControl();*/
            
        //call function to run test
        expResult = 8; //expected output of alienHp if the random generator = 40-75 or 35% chance (20-5)
        result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #4");
        
        //Input values for test case 2
        
        playerHp = 100;
        alienHp = 20;
        weakAttack = 5;
        mediumAttack =12;
        strongAttack =17;
        
        //create instance of ActorControl class
        /*ActorControl instance = new ActorControl();*/
            
        //call function to run test
        expResult = 3; //expected result if random generator chooses 18-40 or 23% chance (20-12)
        result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #5");
        
        //Input values for test case 2
        
        playerHp = 100;
        alienHp = 20;
        weakAttack = 5;
        mediumAttack =12;
        strongAttack =17;
        
        //create instance of ActorControl class
        /*ActorControl instance = new ActorControl();*/
            
        //call function to run test
        expResult = 3; //expected result if random generator chooses 1-17 or 17% chance (20-12)
        result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #6");
        
        //Input values for test case 2
        
        playerHp = 100;
        alienHp = 20;
        weakAttack = 5;
        mediumAttack =12;
        strongAttack =17;
        
        //create instance of ActorControl class
        /*ActorControl instance = new ActorControl();*/
            
        //call function to run test
        expResult = 8; //expected result if random generator chooses 75-100 or 25% chance (100-(12*2 or 24)
        result = instance.attackAlien(weakAttack, mediumAttack, strongAttack, playerHp, alienHp);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
}

    /**
     * Test of fleeAlien method, of class ActorControl.
     */
    @Test
    public void testFleeAlien() {
        System.out.println("Test Case #1");
        int userSpeed = 12;
        int weaponSpeedBonus = 2;
        int alienSpeed = 10;
        ActorControl instance = new ActorControl();
        int expResult = 1;
        int result = instance.fleeAlien(userSpeed, weaponSpeedBonus, alienSpeed);
        assertEquals(expResult, result);
        
        System.out.println("Test Case #2");
        
        userSpeed = -1;
        weaponSpeedBonus = 2;
        alienSpeed = 20;

        expResult = -1;
        result = instance.fleeAlien(userSpeed, weaponSpeedBonus, alienSpeed);
        assertEquals(expResult, result);
    }
}

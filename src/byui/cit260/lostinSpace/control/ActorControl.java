/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.lostinSpace.control;

import java.util.Scanner;



public class ActorControl {
    String[] attackMenu;
    Scanner input = new Scanner(System.in);
    
    public int alienAttack(String userInput,int damage,int playerHp,int alienHp) {
    
        attackMenu = new String[1];
        attackMenu[0] = "To select your form of attack, please type the letter associated with it.";
        
        
        userInput = attackMenu[0];
        
        if(userInput==attackMenu[0]){       
            System.out.println(attackMenu[0]);
            System.out.println("A. Ultimate Punch");
            System.out.println("B. Shank in the Rib");
            System.out.println("C. Shoot in the Head");
            System.out.println("D. Atom Bomb /n");
            System.out.println("Your selection: ");
            String userAttackChoice = input.next();
            
            switch (userAttackChoice.toUpperCase()){
                case "A":
                  userAttackChoice = "Ultimate Punch";
                  System.out.println("");
            }
        }
        String userInput = attackMenu[]
    }
}



/**
import java.util.Random;


 *
 * @author devinerickson
 

public class ActorControl {
        public int attackAlien(int damage, int playerHp, int alienHp, int chanceToHit)  {
            
           playerHp = 100;
           alienHp = 20;
                       
            if (damage < 3 || damage > 9){
                return -1;
            } 
            //Still need to find out how to make random number have range.
      Random hit = new Random(5);
            if (damage >= 8){
                //if the random number is odd, the player lands the hit
                if (hit %2 == 1){
                    hit = alienHp - damage;
                }
                else{
                    hit = playerHp - (damage * 2);
                }
            }
            //if the random number is odd OR between 1-50, the player lands the hit
            if (damage <= 7){
                if (hit %2 == 1 || hit <= 50){
                    hit = alienHp - damage;
                }
                else{
                    hit = playerHp - (damage * 2);
                }
            }
        return hit;
    
}
}
*/
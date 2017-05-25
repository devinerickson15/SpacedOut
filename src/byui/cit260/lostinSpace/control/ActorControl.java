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
                if (hit %2 == 1){
                    hit = alienHp - damage;
                }
                else{
                    hit = playerHp - (damage * 2);
                }
            }
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

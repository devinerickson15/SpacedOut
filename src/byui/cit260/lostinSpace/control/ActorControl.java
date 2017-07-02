/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.exceptions.ActorControlException;
import java.util.Random;

public class ActorControl {
        public int attackAlien(int weakAttack,int mediumAttack, int strongAttack, int playerHp, int alienHp) throws ActorControlException {
           
            if (weakAttack < 1) {
                throw new ActorControlException ("*** Weak Earthling, enter a higher number! ***");}
            if (strongAttack > 20) {
                throw new ActorControlException("*** Inferior lifeform, enter a number below 20! ***");}
            
           playerHp = 100;
           alienHp = 20;
           weakAttack = 5;
           mediumAttack =12;
           strongAttack =17;
                                  
Random randomGenerator = new Random(); 

int weakAttackChance = 75;
int mediumAttackChance = 40;
int strongAttackChance = 17;        

int opportunity = randomGenerator.nextInt(100) + 1; 
    if (opportunity <= strongAttackChance) {
    alienHp = alienHp - strongAttack;
        return alienHp;}
    else if (opportunity > strongAttackChance && opportunity <= mediumAttackChance) {
    alienHp = alienHp - mediumAttack;
        return alienHp;}
    else if (opportunity > mediumAttackChance && opportunity < weakAttackChance) {
    alienHp = alienHp - weakAttack;
        return alienHp;} 
    else {
    playerHp = (playerHp - (mediumAttack * 2));
        return playerHp;
}} 

    public int fleeAlien(int userSpeed,int weaponSpeedBonus,int alienSpeed) throws ActorControlException {
        
    weaponSpeedBonus = 2;
    alienSpeed = 12;
        
    Random randomNumber = new Random();
    
    int randomSpeed = randomNumber.nextInt(20) + 1;
    randomSpeed = userSpeed;
    
    int flightSuccess = ((userSpeed + weaponSpeedBonus) - alienSpeed);
    
    if (flightSuccess > 0){
        throw new ActorControlException ("*** You have survived this once, little person! ***");
    }
    else {
        throw new ActorControlException ("*** You have been badly wounded, you might just die out here! ***");
    } 
    }}

/*
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
*/
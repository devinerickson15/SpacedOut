/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Make sure to lesson 12 team assignment page 13-15 when you add the keyboard scanner for this class.

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

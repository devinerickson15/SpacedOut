/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author JacobsonKe
 */
public class Puzzle implements Serializable{
    
    private int userInput1;
    private int userInput2;
    private int userInput3;
    private int difficulty;
    private int puzzle;

    public Puzzle() {
    }

    public int getUserInput1() {
        return userInput1;
    }

    public void setUserInput1(int userInput1) {
        this.userInput1 = userInput1;
    }

    public int getUserInput2() {
        return userInput2;
    }

    public void setUserInput2(int userInput2) {
        this.userInput2 = userInput2;
    }

    public int getUserInput3() {
        return userInput3;
    }

    public void setUserInput3(int userInput3) {
        this.userInput3 = userInput3;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int puzzle) {
        this.puzzle = puzzle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.userInput1;
        hash = 71 * hash + this.userInput2;
        hash = 71 * hash + this.userInput3;
        hash = 71 * hash + this.difficulty;
        hash = 71 * hash + this.puzzle;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puzzle other = (Puzzle) obj;
        if (this.userInput1 != other.userInput1) {
            return false;
        }
        if (this.userInput2 != other.userInput2) {
            return false;
        }
        if (this.userInput3 != other.userInput3) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        if (this.puzzle != other.puzzle) {
            return false;
        }
        return true;
    }
    

    
}

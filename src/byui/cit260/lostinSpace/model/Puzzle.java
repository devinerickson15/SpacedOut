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
    
    private String difficulty;
    private int solution;
    private int puzzle;

    public Puzzle() {
    }
    

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

    public int getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int puzzle) {
        this.puzzle = puzzle;
    }

    @Override
    public String toString() {
        return "Puzzle{" + "difficulty=" + difficulty + ", solution=" + solution + ", puzzle=" + puzzle + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.difficulty);
        hash = 97 * hash + this.solution;
        hash = 97 * hash + this.puzzle;
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
        if (this.solution != other.solution) {
            return false;
        }
        if (this.puzzle != other.puzzle) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

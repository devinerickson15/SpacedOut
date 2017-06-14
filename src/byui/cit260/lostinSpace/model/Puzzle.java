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
    
    private int solution;

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

        @Override
    public String toString() {
        return "Puzzle{" + "solution=" + solution + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.solution;
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
        return true;
    }
  
}

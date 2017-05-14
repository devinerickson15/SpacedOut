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
 * @author devinerickson
 */
public class Alien implements Serializable {
    
    //Bean
    private String flee;
    private String fight;
    private String hide;
    
    public Alien(){
        
    }

    public String getFlee() {
        return flee;
    }

    public void setFlee(String flee) {
        this.flee = flee;
    }

    public String getFight() {
        return fight;
    }

    public void setFight(String fight) {
        this.fight = fight;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "Alien{" + "flee=" + flee + ", fight=" + fight + ", hide=" + hide + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.flee);
        hash = 29 * hash + Objects.hashCode(this.fight);
        hash = 29 * hash + Objects.hashCode(this.hide);
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
        final Alien other = (Alien) obj;
        if (!Objects.equals(this.flee, other.flee)) {
            return false;
        }
        if (!Objects.equals(this.fight, other.fight)) {
            return false;
        }
        if (!Objects.equals(this.hide, other.hide)) {
            return false;
        }
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.model;

/**
 *
 * @author Kevin
 */
public interface AltViewInterface {
    
    public void display();
    public boolean doAction();
    
    public abstract class AltView implements AltViewInterface{
        
        protected String displayMessage;
        
        public AltView() {
            
        }
        
        public AltView(String message) {
            this.displayMessage = message;
        }
        
        
     }
     
}

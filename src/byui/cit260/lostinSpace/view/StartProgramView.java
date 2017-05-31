/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

/**
 *
 * @author devinerickson, megan, keith
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public void displayStartProgramView() {
        System.out.println("\n***displayStartProgram() function called ***");
        this.promptMessage = "\nPlease enter your name: ";
        // display banner
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
                  "\n***************************************************************"
            +   "\n* You awakens to find yourself on an unfamiliar            *"
            +   "\n* and barren planet, with intense winds and no             *"
            +   "\n* sign of life. As you look up to the night sky, you         *"
            +   "\n* observe 14 distant moons, some larger than                *"
            +   "\n* others. Your spaceship has crashed and  you              *"
            +   "\n* have lost all communication with Earth. As you          *"
            +   "\n* look out the window, you notice a shiny metal           *"
            +   "\n* box next to the spaceship. With you spacesuit           *"
            +   "\n* still intact, you open the door of the spaceship          *"
            +   "\n* and retrieves the metal box. Secured safely                *"
            +   "\n* within the box is a map, which provides you               *"
            +   "\n* with the first clue as you begin his journey                 *"
            +   "\n* back to Earth.                                                                   *"
            +   "\n                                                                                             *"
            +   "\n* Knowing you are a long way from home, you             *"
            +   "\n* desperately want to make it back to Earth                 *"
            +   "\n* safely. The goal of the game is for the player             *"
            +   "\n* to return to Earth safely by navigating your              *"
            +   "\n* way through space, fighting off dangerous                *"
            +   "\n* alien creatures, and collecting helpful clues               *"
            +   "\n* and resources as he stops at each of the                    *"
            +   "\n* destinations along the way. You will need to             *"
            +   "\n* find the resources that will help him restore              *"
            +   "\n* the spaceship, gather the necessary fuel,                    *"
            +   "\n* acquire weapons to fight aliens, and                           *"
            +   "\n* eventually land the spaceship safely                           *"
            +   "\n* back on Earth.                                                                 *"
            +   "\n*                                                                                           *"
            +   "\n* Good luck on your journey and safe travels!              *"
            );
    }
    
}

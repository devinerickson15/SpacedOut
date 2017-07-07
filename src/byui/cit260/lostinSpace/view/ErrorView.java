/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.io.PrintWriter;
import lostinspace.LostInSpace;

/**
 *
 * @author JacobsonKe
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = LostInSpace.getOutFile();
    private static final PrintWriter logFile = LostInSpace.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "-----------------------------------------------------"
      + "\n- ERROR -" + errorMessage
      + "\n-----------------------------------------------------");
    
    logFile.println(className + " - " + errorMessage);
    }
    
    
    
}

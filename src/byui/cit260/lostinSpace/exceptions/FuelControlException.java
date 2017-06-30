/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.exceptions;

/**
 *
 * @author JacobsonKe
 */
public class FuelControlException extends Exception {

    public FuelControlException() {
    }

    public FuelControlException(String message) {
        super(message);
    }

    public FuelControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FuelControlException(Throwable cause) {
        super(cause);
    }

    public FuelControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

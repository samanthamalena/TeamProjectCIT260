/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Me
 */
public class EquationControlException extends Exception {

    public EquationControlException() {
    }

    public EquationControlException(String string) {
        super(string);
    }

    public EquationControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public EquationControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public EquationControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Chuakun Xiong
 * Last Updated: 9/11/2024
 */
package xiongchu;

public class DieNotRolledException extends RuntimeException {
    public DieNotRolledException(String s){
        super(s);
        // "not in the expected range of the Die"
    }
    /** TODO: */
    public String getMessage() {
        return "not sure YET";
    }
}

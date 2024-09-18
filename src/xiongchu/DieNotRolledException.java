/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Chuakun Xiong
 * Last Updated: 9/17/2024
 */
package xiongchu;

/**
 * A new exception in case a die is not rolled
 */
public class DieNotRolledException extends RuntimeException {

    /**
     * a constructor that calls the super class
     */
    public DieNotRolledException() {
        super();
    }

    @Override
    public String getMessage() {
        return "DieNotRolledException";
    }
}

/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Chuakun Xiong
 * Last Updated: 9/18/2024
 */
package xiongchu;

import java.util.Random;

/**
 * Creates the Die class to have functionality of a die
 */
public class Die {
    /**
     * Holds the minimum side to a die
     */
    public static final int MIN_SIDES = 2;
    /**
     * Holds the maximum side to a die
     */
    public static final int MAX_SIDES = 100;
    private int currentValue;
    private final int numSides;
    private final Random random = new Random();

    /**
     * A constructor that determines the sides of the dice
     * @param numSides keeps track fo the number of sides on the die
     */
    public Die(int numSides) {
        this.numSides = numSides;
    }

    /**
     * Returns the current value of the dice and sets the
     * currentValue back to zero so the Die must be rolled again.
     * @return returns the last value generated by rolling the Die
     */
    public int getCurrentValue() {
        int temp = currentValue;
        currentValue = 0;
        return temp;
    }

    /**
     * Generates a random number from 2 to whatever value
     * the individual sets for number of sides
     */
    public void roll() {
        currentValue = random.nextInt(1, numSides + 1);
    }
}
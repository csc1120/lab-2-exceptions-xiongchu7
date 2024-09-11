/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Chuakun Xiong
 * Last Updated: 9/11/2024
 */
package xiongchu;

import java.util.Random;

public class Die {
    private int currentValue;
    private final int numSides;
    private final Random random = new Random();
    private final static int MIN_SIDES = 2;
    private final static int MAX_SIDES = 100;

    public Die(int numSides) {
        this.numSides = numSides;
        if (numSides < MIN_SIDES || numSides > MAX_SIDES) {
            throw new IllegalArgumentException("Bad die creation: Illegal number of sides: " + numSides);
        }
    }

    public int getCurrentValue() {
        int temp = currentValue;
        if (currentValue < MIN_SIDES || currentValue > MAX_SIDES) {
            throw new DieNotRolledException("Not in the expected range of the Die");
        }
        currentValue = 0;
        return temp;
    }

    /**
     * Rolls dice and stores the value in currentValue from 2-100.
     */
    public void roll() {
        currentValue = random.nextInt(MIN_SIDES, MAX_SIDES);
    }
}
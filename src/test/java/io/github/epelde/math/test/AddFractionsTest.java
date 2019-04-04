package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        checkAddFractionsAsIntegers(0, 0, 0);
    }

    @Test
    public void nonZeroPlusZero() {
        checkAddFractionsAsIntegers(3, 0, 3);
    }

    @Test
    public void zeroPlusNonZero() {
        checkAddFractionsAsIntegers(0, 5, 5);
    }

    @Test
    public void nonZeroPlusNonZero() {
        checkAddFractionsAsIntegers(4, 6, 10);
    }

    @Test
    public void negativeIntegerPlusZero() {
        checkAddFractionsAsIntegers(-3, 0, -3);
    }

    @Test
    public void zeroPlusNegativeInteger() {
        checkAddFractionsAsIntegers(0, -9, -9);
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        checkAddFractionsAsIntegers(-3, 1, -2);
    }

    @Test
    public void addingNegativeIntegers() {
        checkAddFractionsAsIntegers(-4, -9, -13);
    }

    @Test
    public void equalDenominatorSum() {
        assertEquals(new Fraction(3, 5), new Fraction(1, 5)
            .plus(new Fraction(2, 5)));
    }

    private void checkAddFractionsAsIntegers(int number1, int number2, int expectedResult) {
        assertEquals(new Fraction(expectedResult), new Fraction(number1).plus(new Fraction(number2)));
    }
}

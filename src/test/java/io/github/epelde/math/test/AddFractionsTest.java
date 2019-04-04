package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void nonZeroPlusNonZero() {
        assertEquals(new Fraction(10), new Fraction(4).plus(new Fraction(6)));
    }

    @Test
    public void negativeIntegerPlusZero() {
        assertEquals(new Fraction(-3), new Fraction(-3).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNegativeInteger() {
        assertEquals(new Fraction(-9), new Fraction(0).plus(new Fraction(-9)));
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void addingNegativeIntegers() {
        assertEquals(new Fraction(-13), new Fraction(-4).plus(new Fraction(-9)));
    }

    @Test
    public void equalDenominatorSum() {
        assertEquals(new Fraction(3, 5), new Fraction(1, 5)
            .plus(new Fraction(2, 5)));
    }
}

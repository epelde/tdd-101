package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonZeroPlusNonZero() {
        assertEquals(10, new Fraction(4).plus(new Fraction(6)).intValue());
    }

    @Test
    public void negativeIntegerPlusZero() {
        assertEquals(-3, new Fraction(-3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void zeroPlusNegativeInteger() {
        assertEquals(-9, new Fraction(0).plus(new Fraction(-9)).intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutput() {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }

    @Test
    public void addingNegativeIntegers() {
        assertEquals(-13, new Fraction(-4).plus(new Fraction(-9)).intValue());
    }
}

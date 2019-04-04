package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerators() {
        assertNotEquals(new Fraction(2, 5), new Fraction(7, 5));
    }

    @Test
    public void differentDenominators() {
        assertNotEquals(new Fraction(2, 5), new Fraction(2, 3));
    }

    @Test
    public void wholeNumberEqualsSameFraction() {
        assertEquals(new Fraction(5, 1), new Fraction(5));
    }

    @Test
    public void wholeNumberNotEqualsToDifferentNumber() {
        assertNotEquals(new Fraction(6), new Fraction(7));
    }

    @Test
    public void numbersAreEqualAfterReducing() {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
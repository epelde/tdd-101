package io.github.epelde.math;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void addWholeNumbers() {
        assertEquals(new Fraction(0),
                new Fraction(0).plus(new Fraction(0)));

        assertEquals(new Fraction(3),
                new Fraction(3).plus(new Fraction(0)));

        assertEquals(new Fraction(5),
                new Fraction(0).plus(new Fraction(5)));

        assertEquals(new Fraction(10),
                new Fraction(4).plus(new Fraction(6)));

        assertEquals(new Fraction(-3),
                new Fraction(-3).plus(new Fraction(0)));

        assertEquals(new Fraction(-9),
                new Fraction(0).plus(new Fraction(-9)));

        assertEquals(new Fraction(-2),
                new Fraction(-3).plus(new Fraction(1)));

        assertEquals(new Fraction(-13),
                new Fraction(-4).plus(new Fraction(-9)));
    }

    @Test
    public void addEqualDenominatorFractions() {
        assertEquals(new Fraction(3, 5),
                new Fraction(1, 5).plus(new Fraction(2, 5)));

        assertEquals(new Fraction(4, 5),
                new Fraction(6, 5).plus(new Fraction(-2, 5)));

        assertEquals(new Fraction(-3, 6),
                new Fraction(-1, 6).plus(new Fraction(-2, 6)));

        assertEquals(new Fraction(-3, 4),
                new Fraction(2, -4).plus(new Fraction(1, -4)));

        assertEquals(new Fraction(10, 20),
                new Fraction(5, 20).plus(new Fraction(5, 20)));
    }

    @Test
    public void addDifferentDenominatorFractionsWithoutReducing() {
        assertEquals(new Fraction(5, 6),
            new Fraction(1, 3).plus(new Fraction(1, 2)));

        assertEquals(new Fraction(21, 54),
                new Fraction(1, 6).plus(new Fraction(2, 9)));

        assertEquals(new Fraction(-1, 15),
                new Fraction(3, 5).plus(new Fraction(-2, 3)));
    }

    @Test
    public void reduceToWholeNumber() {
        assertEquals(new Fraction(1),
                new Fraction(1, 3).plus(new Fraction(2, 3)));

        assertEquals(new Fraction(-5),
                new Fraction(-20, 2).plus(new Fraction(20, 4)));
    }

    @Test
    public void addTwoFractionsWithReducing() {
        assertEquals(new Fraction(17, 12),
                new Fraction(6, 8).plus(new Fraction(2, 3)));

        assertEquals(new Fraction(1, 2),
                new Fraction(5, 20).plus(new Fraction(5, 20)));

        assertEquals(new Fraction(-1, 4),
                new Fraction(-1, 8).plus(new Fraction(-1, 8)));
    }
}

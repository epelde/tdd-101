package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReduceFractionsTest {

    @Test
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));

        assertEquals(new Fraction(7, 14), new Fraction(35, 70));
    }

    @Test
    public void reduceToWholeNumber() {
        assertEquals(new Fraction(6), new Fraction(36, 6));

        assertEquals(new Fraction(-4), new Fraction(8, -2));
    }
}

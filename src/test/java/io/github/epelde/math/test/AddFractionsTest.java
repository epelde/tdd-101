package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }
}

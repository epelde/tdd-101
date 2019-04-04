package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        Assert.assertEquals(0, sum.intValue());
    }
}

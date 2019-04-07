package io.github.epelde.math.test;

import io.github.epelde.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReduceFractionsTest {

    @Test
    @Ignore
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}

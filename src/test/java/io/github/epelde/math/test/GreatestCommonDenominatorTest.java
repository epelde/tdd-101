package io.github.epelde.math.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreatestCommonDenominatorTest {

    @Test
    public void equalNumbersGCD() {
        assertEquals(1, gcd(1, 1));
        assertEquals(2, gcd(2, 2));
        assertEquals(1, gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, gcd(4, 7));
        assertEquals(1, gcd(3, 4));
        assertEquals(1, gcd(-2, -3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, gcd(3, 9));
        assertEquals(5, gcd(5, 30));
        assertEquals(3, gcd(-3, -9));
    }

    @Test
    public void commonFactor() {
        assertEquals(2, gcd(6, 8));
        assertEquals(7, gcd(21, 56));
        assertEquals(12, gcd(-12, -180));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }

}

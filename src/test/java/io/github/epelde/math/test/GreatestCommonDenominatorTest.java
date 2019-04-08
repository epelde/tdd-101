package io.github.epelde.math.test;

import io.github.epelde.math.NumberTheory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreatestCommonDenominatorTest {

    @Test
    public void equalNumbersGCD() {
        assertEquals(1, NumberTheory.gcd(1, 1));

        assertEquals(2, NumberTheory.gcd(2, 2));

        assertEquals(1, NumberTheory.gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, NumberTheory.gcd(4, 7));

        assertEquals(1, NumberTheory.gcd(3, 4));

        assertEquals(1, NumberTheory.gcd(-2, -3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, NumberTheory.gcd(3, 9));

        assertEquals(5, NumberTheory.gcd(5, 30));

        assertEquals(3, NumberTheory.gcd(-3, -9));
    }

    @Test
    public void commonFactor() {
        assertEquals(2, NumberTheory.gcd(6, 8));

        assertEquals(7, NumberTheory.gcd(21, 56));

        assertEquals(12, NumberTheory.gcd(-24, -108));
    }

    @Test
    public void exampleWithZeros() {
        assertEquals(1, NumberTheory.gcd(0, 0));
    }
}

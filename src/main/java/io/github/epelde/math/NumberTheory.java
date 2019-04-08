package io.github.epelde.math;

public class NumberTheory {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return (a != 0) ? Math.abs(a) : 1;
    }

}

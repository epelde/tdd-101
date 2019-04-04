package io.github.epelde.math;

public class Fraction {

    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that) {
        return this;
    }

    public int intValue() {
        return this.integerValue;
    }


}

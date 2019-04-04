package io.github.epelde.math;

public class Fraction {

    private final int integerValue;

    private final int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.intValue() + that.intValue(), this.denominator);
    }

    public int intValue() {
        return this.integerValue;
    }

    public int getNumerator() {
        return this.integerValue;
    }

    public int getDenominator() {
        return this.denominator;
    }

}

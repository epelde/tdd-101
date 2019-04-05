package io.github.epelde.math;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator == that.denominator) {
            return new Fraction(this.numerator + that.numerator, this.denominator);
        } else {
            int commonDenominator = this.denominator * that.denominator;
            Fraction fractionOne = new Fraction((commonDenominator / this.denominator) * this.numerator,
                commonDenominator);
            Fraction fractionTwo = new Fraction((commonDenominator / that.denominator) * that.numerator,
                commonDenominator);
            return fractionOne.plus(fractionTwo);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return ((double)this.numerator / this.denominator) == ((double)that.numerator / that.denominator);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.numerator * 100 + this.denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

}

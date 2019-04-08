package io.github.epelde.math;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        final int gcd = NumberTheory.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator,
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            if (this.isPositive()) {
                return Math.abs(this.numerator) == Math.abs(that.numerator) &&
                        Math.abs(this.denominator) == Math.abs(that.denominator);
            } else {
                return this.numerator == that.numerator && this.denominator == that.denominator;
            }
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

    private boolean isPositive() {
        return this.numerator > 0 && this.denominator > 0 ||
                this.numerator < 0 && this.denominator < 0;
    }

}

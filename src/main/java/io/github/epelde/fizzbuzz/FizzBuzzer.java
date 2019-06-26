package io.github.epelde.fizzbuzz;

public class FizzBuzzer {

    public String echo(int number) {
        if (isNumberMultipleOf(number, 3)) return "Fizz";
        else if (isNumberMultipleOf(number, 5)) return "Buzz";
        return Integer.toString(number);
    }

    private boolean isNumberMultipleOf(int number, int baseNumber) {
        return number % baseNumber == 0;
    }
}

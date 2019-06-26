package io.github.epelde.fizzbuzz;

public class FizzBuzzer {

    public String echo(int number) {
        if (isBothMultipleOfThreeAndFive(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOfThree(number)) {
            return "Fizz";
        }

        if (isMultipleOfFive(number)) {
            return "Buzz";
        }

        return Integer.toString(number);
    }

    private boolean isMultipleOfThree(int number) {
        return isNumberMultipleOf(number, 3);
    }

    private boolean isMultipleOfFive(int number) {
        return isNumberMultipleOf(number, 5);
    }

    private boolean isBothMultipleOfThreeAndFive(int number) {
        return isMultipleOfThree(number) && isMultipleOfFive(number);
    }

    private boolean isNumberMultipleOf(int number, int baseNumber) {
        return number % baseNumber == 0;
    }
}

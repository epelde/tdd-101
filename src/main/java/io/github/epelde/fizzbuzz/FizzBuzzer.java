package io.github.epelde.fizzbuzz;

public class FizzBuzzer {
    public String echo(int number) {
        if (number == 3) return "Fizz";
        else if (number == 5) return "Buzz";
        return Integer.toString(number);
    }
}

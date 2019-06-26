package io.github.epelde.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzerTest {

    @Test
    public void echoNumber() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        Assert.assertEquals("1", fizzBuzzer.echo(1));
    }
}

package io.github.epelde.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzerTest {

    @Test
    public void echoNumbers() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        Assert.assertEquals("1", fizzBuzzer.echo(1));
        Assert.assertEquals("2", fizzBuzzer.echo(2));
    }
}

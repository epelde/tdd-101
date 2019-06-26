package io.github.epelde.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzerTest {

    @Test
    public void echoNumbers() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        Assert.assertEquals("1", fizzBuzzer.echo(1));
        Assert.assertEquals("2", fizzBuzzer.echo(2));
        Assert.assertEquals("4", fizzBuzzer.echo(4));
        Assert.assertEquals("7", fizzBuzzer.echo(7));
        Assert.assertEquals("8", fizzBuzzer.echo(8));
        Assert.assertEquals("11", fizzBuzzer.echo(11));
        Assert.assertEquals("13", fizzBuzzer.echo(13));
        Assert.assertEquals("19", fizzBuzzer.echo(19));
        Assert.assertEquals("100", fizzBuzzer.echo(100));
    }

    @Test
    public void echoFizzWhenNumberIsThree() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        Assert.assertEquals("Fizz", fizzBuzzer.echo(3));
    }
}

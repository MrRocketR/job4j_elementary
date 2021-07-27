package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       int number = 5;
       int expected = 120;
       Assert.assertEquals(120, Factorial.calc(number));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 1;
        int expected = 11;
        Assert.assertEquals(1, Factorial.calc(number));
    }
}
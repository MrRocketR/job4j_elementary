package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenRightMax() {
        int l = 1;
        int r = 2;
        int expected = 2;
        int result = Max.max(1, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void whenLeftmax() {
        int l = 2;
        int r = 1;
        int expected = 2;
        int result = Max.max(2, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void whenAllEquals() {
        int l = 2;
        int r = 2;
        int expected = 2;
        int result = Max.max(2, 2);
        Assert.assertEquals(2, result);
    }
}
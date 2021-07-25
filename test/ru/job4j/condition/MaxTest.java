package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int l = 1;
        int r = 2;
        int expected = 2;
        int result = Max.max(1, 2);
        Assert.assertEquals(2, result);
    }
}
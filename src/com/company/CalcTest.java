package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.company.Main.calc;

public class CalcTest {
    @Test
    public void sumTest() {
        final double testA1 = - 500_000_000_000_000.0;
        final double testA2 = - 500_000_000_000_000.0;
        double res = calc("+", testA1, testA2);
        Assertions.assertEquals(- 1_000_000_000_000_000.0, res);
    }
    @Test
    public void sqrtTest() {
        final double testA1 = 16;
        final double testA2 = 0;
        final double testA3 = -1;
        double res = calc("sqrt", testA1);
        double res1 = calc("sqrt", testA2);
        double res2 = calc("sqrt", testA3);

        Assertions.assertEquals(4, res);
        Assertions.assertEquals(0, res1);
        Assertions.assertEquals(Double.NaN, res2);

    }
    @Test
    public void divTest() {
        final double testA1 = 16;
        final double testA2 = 0;
        double res = calc("/", testA1, testA2);
        Assertions.assertEquals(Double.NaN, res);
    }
    @Test
    public void multiTest() {
        final double testA1 = Double.MAX_VALUE;
        final double testA2 = Double.MAX_VALUE;
        double res = calc("*", testA1, testA2);
        Assertions.assertEquals(Double.NaN, res);
    }
}

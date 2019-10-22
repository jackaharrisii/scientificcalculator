package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class CoreTest {

    private final CoreMethods testMethods = new CoreMethods();

    @Test
    public void calcAddTest1() {
        //given
        double a = 3;
        double b = 6;
        double expected = 9;
        //when
        double outcome = testMethods.calcAdd(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcAddTest2() {
        //given
        double a = 8;
        double b = -4;
        double expected = 4;
        //when
        double outcome = testMethods.calcAdd(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcAddTest3() {
        //given
        double a = 2;
        double b = 0;
        double expected = 2;
        //when
        double outcome = testMethods.calcAdd(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calSubtTest1() {
        //given
        double a = 3;
        double b = 6;
        double expected = -3;
        //when
        double outcome = testMethods.calcSubt(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcSubtTest2() {
        //given
        double a = 8;
        double b = -4;
        double expected = 12;
        //when
        double outcome = testMethods.calcSubt(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcSubtTest3() {
        //given
        double a = 2;
        double b = 0;
        double expected = 2;
        //when
        double outcome = testMethods.calcSubt(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calMultTest1() {
        //given
        double a = 3;
        double b = 6;
        double expected = 18;
        //when
        double outcome = testMethods.calcMult(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcMultTest2() {
        //given
        double a = 8;
        double b = -4;
        double expected = -32;
        //when
        double outcome = testMethods.calcMult(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcMultTest3() {
        //given
        double a = 2;
        double b = 0;
        double expected = 0;
        //when
        double outcome = testMethods.calcMult(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calDivTest1() {
        //given
        double a = 6;
        double b = 3;
        double expected = 2;
        //when
        double outcome = testMethods.calcDiv(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcDivTest2() {
        //given
        double a = 8;
        double b = -4;
        double expected = -2;
        //when
        double outcome = testMethods.calcDiv(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcDivTest3() {
        //given
        double a = 2;
        double b = 8;
        double expected = 0.25;
        //when
        double outcome = testMethods.calcDiv(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calcSquareTest1() {
        //given
        double a = 6;
        double expected = 36;
        //when
        double outcome = testMethods.calcSquare(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcSquareTest2() {
        //given
        double a = -8;
        double expected = 64;
        //when
        double outcome = testMethods.calcSquare(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcSquareTest3() {
        //given
        double a = 0.5;
        double expected = 0.25;
        //when
        double outcome = testMethods.calcSquare(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calcRootTest1() {
        //given
        double a = 36;
        double expected = 6;
        //when
        double outcome = testMethods.calcRoot(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcRootTest2() {
        //given
        double a = 0;
        double expected = 0;
        //when
        double outcome = testMethods.calcRoot(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcRootTest3() {
        //given
        double a = 0.25;
        double expected = 0.5;
        //when
        double outcome = testMethods.calcRoot(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calcExponentTest1() {
        //given
        double a = 5;
        double b = 3;
        double expected = 125;
        //when
        double outcome = testMethods.calcExponent(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcExponentTest2() {
        //given
        double a = 18;
        double b = 1;
        double expected = 18;
        //when
        double outcome = testMethods.calcExponent(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcExponentTest3() {
        //given
        double a = 36;
        double b = 0.5;
        double expected = 6;
        //when
        double outcome = testMethods.calcExponent(a,b);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calcInverseFractionTest1() {
        //given
        double a = 20;
        double expected = 0.05;
        //when
        double outcome = testMethods.calcInverseFraction(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcInverseFractionTest2() {
        //given
        double a = 0.5;
        double expected = 2;
        //when
        double outcome = testMethods.calcInverseFraction(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcInverseFractionTest3() {
        //given
        double a = -4;
        double expected = -0.25;
        //when
        double outcome = testMethods.calcInverseFraction(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }

    @Test
    public void calcInverseSignTest1() {
        //given
        double a = 20;
        double expected = -20;
        //when
        double outcome = testMethods.calcInverseSign(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcInverseSignTest2() {
        //given
        double a = 0.5;
        double expected = -0.5;
        //when
        double outcome = testMethods.calcInverseSign(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
    @Test
    public void calcInverseSignTest3() {
        //given
        double a = -4;
        double expected = 4;
        //when
        double outcome = testMethods.calcInverseSign(a);
        //then
        Assert.assertEquals(expected, outcome, 00);
    }
}

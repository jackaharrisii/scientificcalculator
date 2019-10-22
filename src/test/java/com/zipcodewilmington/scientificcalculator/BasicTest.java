package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BasicTest {

    private final CalculatorMethods testMethods = new CalculatorMethods();

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
        double a = 3;
        double b = 6;
        double expected = 18;
        //when
        double outcome = testMethods.calcDiv(a,b);
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
}

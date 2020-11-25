package by.tc.task01.t02;

import by.tc.task01.t01.LastDigitOfTheSquare;
import org.junit.Assert;
import org.junit.Test;

public class AmountDaysInTheMonthTest {

    @Test
    public void somePositiveTest01(){
        int month = 11;
        int year = 2020;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int expected = 30;
        int actual = obj.count(month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest02(){
        int month = 2;
        int year = 2020;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int expected = 29;
        int actual = obj.count(month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest03(){
        int month = 2;
        int year = 2019;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int expected = 28;
        int actual = obj.count(month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01() throws IllegalArgumentException {
        int month = 24;
        int year = 2020;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int actual = obj.count(month, year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest02() throws IllegalArgumentException {
        int month = 12;
        int year = -22;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int actual = obj.count(month, year);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest03() throws IllegalArgumentException {
        int month = -1;
        int year = 2020;
        AmountDaysInTheMonth obj = new AmountDaysInTheMonth();
        int actual = obj.count(month, year);
    }
}

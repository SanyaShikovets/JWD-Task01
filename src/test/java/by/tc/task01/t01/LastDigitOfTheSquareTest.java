package by.tc.task01.t01;

import org.junit.Assert;
import org.junit.Test;

public class LastDigitOfTheSquareTest {

    @Test
    public void somePositiveTest01(){
        int a = 1;
        int expected = 1;
        LastDigitOfTheSquare obj = new LastDigitOfTheSquare();
        int actual = obj.findLastDigit(a);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest02(){
        int a = 4;
        int expected = 6;
        LastDigitOfTheSquare obj = new LastDigitOfTheSquare();
        int actual = obj.findLastDigit(a);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01() throws IllegalArgumentException {
        int a = -1;
        LastDigitOfTheSquare obj = new LastDigitOfTheSquare();
        int actual = obj.findLastDigit(a);
    }
}

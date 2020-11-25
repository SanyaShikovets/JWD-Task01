package by.tc.task01.t08;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void somePositiveTest01(){
        double x = 3;
        double expected = 9;
        Function obj = new Function();
        double actual = obj.f(x);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void somePositiveTest02(){
        double x = 6;
        double expected = -9;
        Function obj = new Function();
        double actual = obj.f(x);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void somePositiveTest03(){
        double x = 2;
        double expected = 0.5;
        Function obj = new Function();
        double actual = obj.f(x);
        Assert.assertEquals(expected, actual, 0);
    }
}

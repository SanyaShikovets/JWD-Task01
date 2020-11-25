package by.tc.task01.t05;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {

    @Test
    public void somePositiveTest01(){
        int number = 6;
        boolean expected = true;
        PerfectNumber obj = new PerfectNumber();
        boolean actual = obj.find(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest02(){
        int number = 8128;
        boolean expected = true;
        PerfectNumber obj = new PerfectNumber();
        boolean actual = obj.find(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest03(){
        int number = 33550336;
        boolean expected = true;
        PerfectNumber obj = new PerfectNumber();
        boolean actual = obj.find(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest04(){
        int number = 5;
        boolean expected = false;
        PerfectNumber obj = new PerfectNumber();
        boolean actual = obj.find(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest05(){
        int number = 3355;
        boolean expected = false;
        PerfectNumber obj = new PerfectNumber();
        boolean actual = obj.find(number);
        Assert.assertEquals(expected, actual);
    }
}

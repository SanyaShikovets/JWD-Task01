package by.tc.task01.t04;

import org.junit.Assert;
import org.junit.Test;

public class TwoEvenTest {

    @Test
    public void somePositiveTest01(){
        Integer[] numbers = {1, 2, 3, 4};
        boolean expected = true;
        TwoEven obj = new TwoEven();
        boolean actual = obj.find(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest02(){
        Integer[] numbers = {1, 1, 3, 4};
        boolean expected = false;
        TwoEven obj = new TwoEven();
        boolean actual = obj.find(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest03(){
        Integer[] numbers = {1, 1, -1, -3};
        boolean expected = false;
        TwoEven obj = new TwoEven();
        boolean actual = obj.find(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest04(){
        Integer[] numbers = {12, 2, 3, 4};
        boolean expected = true;
        TwoEven obj = new TwoEven();
        boolean actual = obj.find(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void somePositiveTest05(){
        Integer[] numbers = {16, 2, 38, 40};
        boolean expected = true;
        TwoEven obj = new TwoEven();
        boolean actual = obj.find(numbers);
        Assert.assertEquals(expected, actual);
    }
}

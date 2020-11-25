package by.tc.task01.t07;

import org.junit.Assert;
import org.junit.Test;

public class TwoPointTest {

    @Test
    public void somePositiveTest01(){
        Integer[] A = {1, 2};
        Integer[] B = {4, 5};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
        Assert.assertEquals(A, actual);
    }

    @Test
    public void somePositiveTest02(){
        Integer[] A = {1, 2};
        Integer[] B = {-4, 5};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
        Assert.assertEquals(A, actual);
    }

    @Test
    public void somePositiveTest03(){
        Integer[] A = {-1, -2};
        Integer[] B = {-4, 5};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
        Assert.assertEquals(A, actual);
    }

    @Test
    public void somePositiveTest04(){
        Integer[] A = {1, 2};
        Integer[] B = {1, 0};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
        Assert.assertEquals(B, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01(){
        Integer[] A = {1, 2, 1};
        Integer[] B = {1, 0};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest02(){
        Integer[] A = {1, 2};
        Integer[] B = {1, 0, 63};
        TwoPoint obj = new TwoPoint();
        Integer[] actual = obj.find(A, B);
    }
}

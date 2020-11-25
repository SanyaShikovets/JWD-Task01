package by.tc.task01.t10;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FunctionTanTest {

    @Test
    public void somePositiveTest01(){
        double a = 1;
        double b = 2;
        double h = 0.5;
        Map<Double, Double> expectedMap = new HashMap<>();
        expectedMap.put(1.0, 1.5574077246549023);
        expectedMap.put(1.5, 14.101419947171719);
        expectedMap.put(2.0, -2.185039863261519);
        FunctionTan obj = new FunctionTan();
        Map<Double, Double> actualMap = obj.find(a, b, h);
        Assert.assertEquals(expectedMap, actualMap);
    }
}

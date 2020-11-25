package by.tc.task01.t03;

import org.junit.Assert;
import org.junit.Test;

public class CircleInscribedInSquareTest {

    @Test
    public void somePositiveTest01(){
        double area = 16;
        double expectedArea = 8;
        double expectedTime = 2;
        CircleInscribedInSquare obj = new CircleInscribedInSquare();
        double actualArea = obj.count(area);
        double actualTime = obj.areaLess(area);
        Assert.assertEquals(expectedArea, actualArea, 0);
        Assert.assertEquals(expectedTime, actualTime, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01(){
        double area = -1;
        CircleInscribedInSquare obj = new CircleInscribedInSquare();
        double actualArea = obj.count(area);
    }
}

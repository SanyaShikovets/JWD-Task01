package by.tc.task01.t09;

import org.junit.Assert;
import org.junit.Test;

public class LengthAndAreaCircleTest {

    @Test
    public void somePositiveTest01(){
        double R = 4;
        double expectedLength = 25.132741228718345;
        double expectedArea = 50.26548245743669;
        LengthAndAreaCircle obj = new LengthAndAreaCircle();
        double actualLength = obj.findLength(R);
        double actualArea = obj.findArea(R);
        Assert.assertEquals(expectedLength, actualLength, 0);
        Assert.assertEquals(expectedArea, actualArea, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01(){
        double R = -14;
        LengthAndAreaCircle obj = new LengthAndAreaCircle();
        double actualLength = obj.findLength(R);
        double actualArea = obj.findArea(R);
    }
}

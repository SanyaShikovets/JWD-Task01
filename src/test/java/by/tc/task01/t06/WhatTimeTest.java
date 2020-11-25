package by.tc.task01.t06;

import by.tc.task01.t06.WhatTime;
import org.junit.Assert;
import org.junit.Test;

public class WhatTimeTest {

    @Test
    public void somePositiveTest01(){
        int second = 5999;
        String expectedTime = "1:39:59";
        WhatTime obj = new WhatTime();
        String actualTime = obj.find(second);
        Assert.assertEquals(expectedTime,actualTime);
    }

    @Test
    public void somePositiveTest02(){
        int second = 2761;
        String expectedTime = "0:46:1";
        WhatTime obj = new WhatTime();
        String actualTime = obj.find(second);
        Assert.assertEquals(expectedTime,actualTime);
    }

    @Test
    public void somePositiveTest03(){
        int second = 16;
        String expectedTime = "0:0:16";
        WhatTime obj = new WhatTime();
        String actualTime = obj.find(second);
        Assert.assertEquals(expectedTime,actualTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest01(){
        int second = -13;
        WhatTime obj = new WhatTime();
        String actualTime = obj.find(second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void someNegativeTest02(){
        int second = 100000;
        WhatTime obj = new WhatTime();
        String actualTime = obj.find(second);
    }
}

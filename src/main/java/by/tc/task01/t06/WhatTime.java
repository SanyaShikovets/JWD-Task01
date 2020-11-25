package by.tc.task01.t06;

public class WhatTime {

    public String find(int second){
        if(second < 0 || second >= 24 * 3600)
            throw new IllegalArgumentException();
        int hourNow = second / 3600;
        int minuteNow = (second - hourNow * 3600) / 60;
        int secondNow = second - hourNow * 3600 - minuteNow * 60;
        return hourNow + ":" + minuteNow + ":" + secondNow;
    }

}

package by.tc.task01.t09;

public class LengthAndAreaCircle {

    public double findLength(double R){
        if(R < 0)
            throw new IllegalArgumentException();
        return 2 * Math.PI * R;
    }

    public double findArea(double R){
        if(R < 0)
            throw new IllegalArgumentException();
        return Math.PI * R * R;
    }
}

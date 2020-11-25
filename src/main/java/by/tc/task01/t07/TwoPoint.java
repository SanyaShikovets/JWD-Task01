package by.tc.task01.t07;

public class TwoPoint {

    public Integer[] find(Integer[] A, Integer[] B) {
        if(A.length != 2 || B.length != 2)
            throw new IllegalArgumentException();
        double d1 = Math.sqrt(A[0] * A[0] + A[1] * A[1]);
        double d2 = Math.sqrt(B[0] * B[0] + B[1] * B[1]);
        if(d1 < d2)
            return A;
        else
            return B;
    }
}

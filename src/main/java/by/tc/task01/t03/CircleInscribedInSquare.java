package by.tc.task01.t03;

public class CircleInscribedInSquare {

    public double count(double areaSquare){
        if(areaSquare < 0)
            throw new IllegalArgumentException();
        double radius = Math.sqrt(areaSquare) / 2;
        return radius * radius * 2;
    }

    public double areaLess(double areaSquare){
        if(areaSquare < 0)
            throw new IllegalArgumentException();
        return areaSquare / count(areaSquare);
    }
}

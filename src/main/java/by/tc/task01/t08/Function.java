package by.tc.task01.t08;

public class Function {

    public double f(double x){
        if(x >= 3)
            return - x * x + 3 * x + 9;
        else
            return 1 / (x * x * x - 6);
    }
}

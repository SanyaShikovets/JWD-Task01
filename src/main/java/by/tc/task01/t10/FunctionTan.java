package by.tc.task01.t10;

import java.util.HashMap;
import java.util.Map;

public class FunctionTan {

    public Map<Double, Double> find(double a, double b, double h){
        Map<Double, Double> result = new HashMap<>();
        for(double i = a; i <= b; i+=h)
            result.put(i, Math.tan(i));
        return result;
    }
}

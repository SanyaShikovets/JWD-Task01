package by.tc.task01.t04;

public class TwoEven {

    public boolean find(Integer[] numbers){
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0)
                count++;
        }
        return count >= 2;
    }
}

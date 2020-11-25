package by.tc.task01.t05;

public class PerfectNumber {

    public boolean find(Integer number){
        int sum = 0;
        if(number == 1)
            return false;
        for(int i = 1; i * i <= number; i++){
            if(number % i == 0) {
                if(i == number / i || i == 1)
                    sum += i;
                else {
                    sum += i;
                    sum += number / i;
                }
            }
        }
        return sum == number;
    }
}

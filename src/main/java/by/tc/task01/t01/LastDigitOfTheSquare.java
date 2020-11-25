package by.tc.task01.t01;

public class LastDigitOfTheSquare {

    public int findLastDigit(int lastDigit) {
        if(lastDigit < 0)
            throw new IllegalArgumentException();
        return lastDigit * lastDigit % 10;
    }

}

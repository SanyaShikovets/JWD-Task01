package by.tc.task01.t02;

public class AmountDaysInTheMonth {

    Integer[] countDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public int count(int month, int year){
        if(year < 0 || month < 1 || month > 12)
            throw new IllegalArgumentException();
        if(isLeapYear(year) && month == 2)
            return 29;
        return countDays[month - 1];
    }
}

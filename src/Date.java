public class Date {
    int year;
    int month;
    int day;

    boolean isMonthValid(){
        return month >= 1 && month <= 12;
    }

    boolean isDayValid(){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            return day>=1 && day <= 31;
        } else if (month == 4 || month == 6 || month == 9|| month == 11) {
            return day>=1 && day <= 30;
        } else if (month == 2) {
            return day>=1 && day <= 27;
        }
        return false;
    }
}

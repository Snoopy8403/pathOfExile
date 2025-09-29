public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){}

    public Date(int month, int day){
        this.month = month;
        this.day = day;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void incrementDay(){
        day++;
        if (!isDayValid()){
            day = 1;
            incrementMonth();
        }
    }

    public void incrementMonth(){
        month++;
        if (!isMonthValid()){
            month = 1;
            year++;
        }
    }

    public void decrementMonth(){
        month--;
        if (!isMonthValid()){
            month = 12;
            year--;
        }
    }

    public void incrementYear(){
     year++;
    }

    public void decrementYear(){
        year--;
    }

    public void decrementDay(){
        day--;
        if (!isDayValid()){
            decrementMonth();
            day = getLastDayOfMonth();
        }
    }

    private int getLastDayOfMonth() {
        return switch (month){
            case 1 -> 31;
            case 2 -> isLeapYear() ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 30;
        };
    }

    public boolean isDayValid(){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            return day>=1 && day <= 31;
        } else if (month == 4 || month == 6 || month == 9|| month == 11) {
            return day>=1 && day <= 30;
        } else if (month == 2) {
            if (isLeapYear()) {
                return day >= 1 && day <= 29;
            } else {
                return day >= 1 && day <= 28;
            }
        }
        return false;
    }

    public boolean isMonthValid(){
        return month >= 1 && month <= 12;
    }

    public boolean isLeapYear(){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}

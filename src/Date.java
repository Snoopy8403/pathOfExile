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

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

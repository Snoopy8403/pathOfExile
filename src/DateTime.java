public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        super(year, month, day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public void incrementSecond() {
        second++;
        if (!isSecondValid()) {
            second = 0;
            incrementMinute();
        }
    }

    public void decrementSecond() {
        second--;
        if (!isSecondValid()) {
            second = 59;
            decrementMinute();
        }
    }

    public void incrementMinute() {
        minute++;
        if (!isMinuteValid()) {
            minute = 0;
            incrementHour();
        }
    }

    public void decrementMinute() {
        minute--;
        if (!isMinuteValid()) {
            minute = 59;
            decrementHour();
        }
    }

    public void incrementHour(){
        hour++;
        if (!isHourValid()){
            hour =  0;
            incrementDay();
        }
    }

    public void decrementHour(){
        hour--;
        if (!isHourValid()){
            hour =  23;
            decrementDay();
        }
    }

    public boolean isHourValid() {
        return hour >= 0 && hour <= 23;
    }

    public boolean isMinuteValid() {
        return minute >= 0 && minute <= 59;
    }

    public boolean isSecondValid() {
        return second >= 0 && second <= 59;
    }


}

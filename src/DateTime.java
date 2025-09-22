public class DateTime extends Date{
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

    public void incrementSecond(){
        second++;
                if(!isSecondValid()){
                    second = 0;
                    minute++;
                    if (!isMinuteValid()){
                        minute = 0;
                        hour++;
                        if (!isHourValid()){
                            hour = 0;
                            incrementDay();
                        }
                    }
                }
    }

    public boolean isHourValid(){
        return hour >= 0 && hour <= 23;
    }

    public boolean isMinuteValid(){
        return minute >= 0 && minute <= 59;
    }

    public boolean isSecondValid(){
        return second >= 0 && second <= 59;
    }


}

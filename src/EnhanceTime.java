public class EnhanceTime {
    private Range hour = new Range(0, 23);
    private Range minute = new Range(0, 59);
    private Range second = new Range(0, 59);

    public void incrementSecond(){
        if (second.increment()){
            if (minute.increment()){
                hour.increment();
            }
        }
    }

    public void decrementSecond(){
        if (second.decrement()){
            if (minute.decrement()){
                hour.decrement();
            }
        }
    }

    public int getHour(){
       return hour.getValue();
    }

    public int getMinute(){
        return minute.getValue();
    }

    public int getSecond(){
        return second.getValue();
    }


}

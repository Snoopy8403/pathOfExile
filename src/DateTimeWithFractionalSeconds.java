public class DateTimeWithFractionalSeconds extends DateTime{
    private int microSecond;

    public DateTimeWithFractionalSeconds(int year, int month, int day, int hour, int minute, int second, int microSecond) {
        super(year, month, day, hour, minute, second);
        this.microSecond = microSecond;
    }

    public int getMicroSecond() {
        return microSecond;
    }

    public void incrementMicroSecond(){
        microSecond++;
        if (!isMicroSecondValid()){
            microSecond =  0;
            incrementSecond();
        }
    }

    public void decrementMicroSecond(){
        microSecond--;
        if (!isMicroSecondValid()){
            microSecond = 999999;
            decrementSecond();
        }
    }

    private boolean isMicroSecondValid() {
            return microSecond >= 0 && microSecond <= 999999;
    }


}

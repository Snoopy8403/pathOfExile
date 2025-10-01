public class Range {
    private int value;
    private int minValue;
    private int maxValue;

    private Range(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getValue() {
        return value;
    }

    public boolean increment(){
        value++;
        if (isOverflowing()){
            value = minValue;
            return true;
        }
        return false;
    }

    public boolean decrement(){
        value--;
        if (isUnderflowing()){
            value = maxValue;
            return true;
        }
        return false;
    }

    private boolean isOverflowing(){
        return value > maxValue;
    }

    private boolean isUnderflowing(){
        return value < minValue;
    }

}

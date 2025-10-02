public class oopBasic {
    public static void main(String[] args) {
        EnhanceTime currentDate = new EnhanceTime();
        for (int i =0; i < 1_000; i++){
            currentDate.incrementSecond();
            System.out.println(currentDate.getHour() + ":" + currentDate.getMinute() + ":" + currentDate.getSecond());
        }
    }

    //1. EnhanceDate osztály megvalósítása

}

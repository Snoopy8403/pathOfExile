public class oopBasic {
    public static void main(String[] args) {

        Date today = getToday();

        boolean birthday = isBirthday(today);
        if (birthday) {
            System.out.println("Boldog szülinapot!");
        }
    }

    static boolean isBirthday(Date date){
        return date.month == 6 && date.day == 29;
    }

    static Date getToday(){
        Date date = new Date();
        date.year = 2020;
        date.month = 6;
        date.day = 29;

        return date;
    }
}

public class oopBasic {
    public static void main(String[] args) {
        Date today = new Date(2017, 7, 9);
        DateTime now = new DateTime(2020, 8, 1, 18, 12, 44);

        //
//        System.out.println("A hónap helyes?: " + today.isMonthValid());
//        System.out.println("A nap helyes?: " + today.isDayValid());
//        System.out.println("ez egy szökőév?: " + today.isLeapYear());
//
       Date yearToCheck = new Date();
       yearToCheck.setMonth(1);
        yearToCheck.setDay(1);
        for (int year = 1900; year <= 2100; year++){
            yearToCheck.setYear(year);
            System.out.println(yearToCheck.getYear() + (yearToCheck.isLeapYear() ? " szökőév" : " nem szökőév"));
        }
    }
}

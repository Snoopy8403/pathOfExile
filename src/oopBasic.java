public class oopBasic {
    public static void main(String[] args) {
        Date currentDate = new Date(2020, 8, 17);
        for (int i =0; i < 400; i++){
            currentDate.decrementDay();
            System.out.println(currentDate.getYear() + "-" + currentDate.getMonth() + "-" + currentDate.getDay());
        }
        //1. feladat: decrementSecond és decrementDay metodusokat csinálni
        //2. feladat: a többi mezőhöz is megcsinálni az increment és a decrement metódusokat.
        //3. feladat: ne legyen kód duplikáció!
    }
}

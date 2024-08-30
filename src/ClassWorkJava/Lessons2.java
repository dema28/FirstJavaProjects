package ClassWorkJava;

public class Lessons2 {
    public static void main(String[] args) {

        int regular = 120;
        int doppel = 25;
        int archers = 30;
        int leut = 2;
        int capitan = 1;

        int baseSalary = 6;

        //-------------------------

        int summa = regular * baseSalary
                + (archers + doppel) * 2 *baseSalary
                + leut * 10 * baseSalary
                + capitan * 100 * baseSalary;

        System.out.println(summa);

    }
}

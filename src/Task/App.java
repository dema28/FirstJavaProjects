package Task;

import static Helpers.HelperTask.*;

public class App {
//
    public static void main(String[] args) {
        task(1);
        /**
         * Написать метод, который принимает параметр l и печатает
         *  последовательность четных чисел от нуля.
         *  Длина последовательности = l .
         */
        pincod(4);
        task(2);
        /**
         * Вывести последовательность 0123456789 00112233445566778899 000…
         * до числа 9999 включительно.
         *
         *
         *
         */
        System.out.println(qwerty());

        task(3);
        /**
         * Распечатайте последовательность чисел:
         *  0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */

        task3(6);
        System.out.println();
        task(4);
        /**
         * Распечатать последовательность чисел:
         *          * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */
        task4(25);
        System.out.println();

        task(5);

        /**
         * Написать метод, который принимает параметры n, m, l, и печатает последовательность
         * нечетных чисел начиная с числа n, с шагом m, l длина последовательности
         */

        lineNumbers(4,3,15);
    }

}






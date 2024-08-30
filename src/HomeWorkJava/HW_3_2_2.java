package HomeWorkJava;

public class HW_3_2_2 {
    public static void main(String[] args) {

                int result = 1; // Начальное значение 5^0 = 1
                int power = 0;  // Начальная степень

                // Цикл для вычисления и вывода степеней числа 5
                while (result < 10000) {
                    System.out.println("5^" + power + " = " + result);
                    power++;
                    result *= 5;
                }

    }
}

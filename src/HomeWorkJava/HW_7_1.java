package HomeWorkJava;

public class HW_7_1 {
    public static class Doubler {

        // Метод для удвоения целого числа
        public static int doubleInteger(int i) {
            return i * 2;
        }

        public static void main(String[] args) {
            // Пример использования метода
            int result = doubleInteger(7); // Удваиваем число 7
            System.out.println("Doubled number: " + result); // Вывод: 14
        }
    }
}

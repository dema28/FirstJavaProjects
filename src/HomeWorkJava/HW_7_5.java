package HomeWorkJava;

public class HW_7_5 {
    public static class SheepCounter {

        public static String countSheep(int num) {
            StringBuilder murmur = new StringBuilder(); // Используем StringBuilder для эффективной работы со строками

            // Проходим по всем числам от 1 до num
            for (int i = 1; i <= num; i++) {
                murmur.append(i).append(" sheep...");
            }

            return murmur.toString(); // Возвращаем итоговую строку
        }

        public static void main(String[] args) {
            // Примеры использования
            System.out.println(countSheep(3)); // Output: "1 sheep...2 sheep...3 sheep..."
            System.out.println(countSheep(5)); // Output: "1 sheep...2 sheep...3 sheep...4 sheep...5 sheep..."
        }
    }
}
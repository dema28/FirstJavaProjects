package HomeWorkJava;

public class HW_7_2 {
    public static class LoveCheck {

        // Метод для проверки "влюбленности"
        public static boolean IsLove(int flower1, int flower2) {
            // Если одно количество лепестков четное, а другое нечетное, возвращаем true
            return (flower1 % 2 == 0 && flower2 % 2 != 0) ||
                    (flower1 % 2 != 0 && flower2 % 2 == 0);
        }

        public static void main(String[] args) {
            // Пример использования метода
            int petalsTimmy = 4;
            int petalsSarah = 7;

            System.out.println("Are they in love? " + IsLove(petalsTimmy, petalsSarah)); // true
        }
    }
}

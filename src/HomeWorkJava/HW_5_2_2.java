package HomeWorkJava;

public class HW_5_2_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }

        System.out.println("Количество букв 'е': " + count);  // Ответ: 4

    }
}

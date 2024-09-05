package HomeWorkJava;

public class HW_5_2_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));  // Вывод "ооооо"
            }
        }

    }
}

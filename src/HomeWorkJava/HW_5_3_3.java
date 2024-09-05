package HomeWorkJava;

public class HW_5_3_3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");  // Отступы
            }
            for (int j = 9 - i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

package HomeWorkJava;

public class HW_5_3_2 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("   ");  // Отступы
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }

    }
}

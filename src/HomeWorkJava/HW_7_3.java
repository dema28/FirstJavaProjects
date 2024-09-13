package HomeWorkJava;

public class HW_7_3 {
    public static class NumberToString {

        public static String numberToString(int num) {
            return String.valueOf(num);
        }

        public static void main(String[] args) {
            System.out.println(numberToString(123));  // "123"
            System.out.println(numberToString(999));  // "999"
            System.out.println(numberToString(-100)); // "-100"
        }
    }
}


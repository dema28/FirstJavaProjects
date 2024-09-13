package HomeWorkJava;

public class HW_7_4 {

    public static class SmallestIntegerFinder {

        public static int findSmallestInt(int[] args) {
            // Инициализируем переменную для хранения наименьшего значения
            int smallest = args[0]; // Первое число в массиве

            // Проходим по всем элементам массива
            for (int i = 1; i < args.length; i++) {
                // Если текущий элемент меньше наименьшего, обновляем smallest
                if (args[i] < smallest) {
                    smallest = args[i];
                }
            }

            return smallest;
        }

        public static void main(String[] args) {
            // Примеры использования
            int[] array1 = {34, 15, 88, 2};
            int[] array2 = {34, -345, -1, 100};

            System.out.println(findSmallestInt(array1)); // Output: 2
            System.out.println(findSmallestInt(array2)); // Output: -345
        }
    }
}
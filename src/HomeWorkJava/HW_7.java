package HomeWorkJava;

public class HW_7 {
    public static class Calculator {

        // Метод для сложения двух чисел
        public static double add(double a, double b) {
            return a + b;
        }

        // Метод для вычитания двух чисел
        public static double subtract(double a, double b) {
            return a - b;
        }

        // Метод для умножения двух чисел
        public static double multiply(double a, double b) {
            return a * b;
        }

        // Метод для деления двух чисел
        public static double divide(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        }

        public static void main(String[] args) {
            // Пример использования методов
            double num1 = 0;
            double num2 = 8;

            System.out.println("Addition: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));
        }
    }


    }

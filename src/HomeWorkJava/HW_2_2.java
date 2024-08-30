package HomeWorkJava;

public class HW_2_2 {
    public static void main(String[] args) {

                double loot = 2500; // Общая сумма добычи в пиастрах
                int pirates = 28; // Количество пиратов на корабле (включая капитана)

                double owner = loot / 2; // Доля владельца корабля
                double remainingAfterOwner = loot - owner; // Остаток после владельца

                double captain = remainingAfterOwner / 2; // Доля капитана (половина оставшегося после владельца)
                double remainingAfterCaptain = remainingAfterOwner - captain; // Остаток после капитана

                double crewShare = remainingAfterCaptain / pirates; // Доля каждого пирата

                // Вывод результатов
                System.out.printf("Владелец получает: %.2f пиастров\r\n", owner);
                System.out.printf("Капитан получает: %.2f пиастров\r\n", (captain + crewShare));
                System.out.printf("Пираты получают по: %.2f пиастров каждый\r\n", crewShare);

                // Если капитан утверждает, что он владелец корабля
                double captainAsOwner = owner + crewShare;
                System.out.printf("Джек Воробей получает: %.2f пиастров, если он владелец корабля.\r\n", captainAsOwner);

        // %.2f — это спецификатор формата в методе printf (или format) в Java,
        // который используется для форматирования чисел с плавающей точкой

        //  %: Указывает на начало спецификатора формата.
        //  .2: Определяет количество знаков после запятой, которые будут отображены. В данном случае — 2 знака после запятой.
        //  f: Означает, что число должно быть форматировано как число с плавающей точкой (тип float или double).
        // %.2f округляет число до двух знаков после запятой и выводит его.



    }
}

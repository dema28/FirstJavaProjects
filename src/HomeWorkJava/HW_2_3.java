package HomeWorkJava;

public class HW_2_3 {
    public static void main(String[] args) {

                double loot = 2500; // Общая сумма добычи
                int crew = 28; // Количество пиратов (включая капитана)

                double ownerShare = loot / 2; // Доля владельца
                double leftAfterOwner = loot - ownerShare; // Остаток после владельца

                double captainShare = leftAfterOwner / 2; // Доля капитана
                double leftAfterCaptain = leftAfterOwner - captainShare; // Остаток после капитана

                double crewShare = leftAfterCaptain / crew; // Доля каждого члена экипажа

                System.out.printf("Владелец получает: %.2f пиастров\r\n", ownerShare);
                System.out.printf("Капитан получает: %.2f пиастров\r\n", (captainShare + crewShare));
                System.out.printf("Экипаж получает по: %.2f пиастров каждый\r\n", crewShare);

                // Если капитан утверждает, что он владелец корабля
                double captainAsOwner = ownerShare + crewShare;
                System.out.printf("Джек Воробей получает: %.2f пиастров, если он владелец корабля.\r\n", captainAsOwner);

                // Проверка правильности дележа
                double totalDist = ownerShare + captainShare + (crewShare * crew); // Сумма всех долей
                if (Math.abs(totalDist - loot) < 1e-9) {
                    System.out.println("Дележ правильный: сумма всех долей совпадает с исходной добычей.");
                } else {
                    System.out.printf("Ошибка в дележке: распределено %.2f пиастров, но исходная добыча составляет %.2f пиастров.\r\n", totalDist, loot);
                }

    }
}

// if — это ключевое слово в языке программирования Java (и многих других языках),
// используемое для выполнения условного оператора.
// Оно позволяет выполнять определенный блок кода только в том случае,
// если заданное условие истинно (возвращает true).


// else: Можно использовать для выполнения альтернативного блока кода,
// если условие в if оказалось ложным (false).

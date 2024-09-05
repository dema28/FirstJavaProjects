package HomeWorkJava;

public class HW_5_2_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм".toLowerCase();
        String substring = "рит";
        int index = s.indexOf(substring);

        while (index != -1) {
            System.out.println("Подстрока 'рит' найдена на индексе: " + index);
            index = s.indexOf(substring, index + 1);
        }
// Ответ: 6, 15, 29

    }
}

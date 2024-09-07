package HW8;
import static Helpers.Helper.*;
        import static HW8.HW8_1.*;
public class HW8 {
    static Integer a = 100;
    static Double b = 200.0;
    static String c = "Nikki";

    public static void main(String[] args) {
        task(6);
//        Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
//HW8	 		|HW8_1			|areEquals?
//____________________________________________
//Double d = …	|Double d_1 = …		| true or false
//……
        System.out.println(compare(a, a_1, b, b_1, c, c_1));
    }
}

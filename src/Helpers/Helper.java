package Helpers;

public class Helper {public static String compare(Integer a, Integer a_1, Double b, Double b_1,
                                                  String c, String c_1) {
    String result = "___________________________________________________________\n";
    result += String.format("|%-20s|%-20s|%15s|%n", "HW8", "HW8_1", "Total");
    result += "___________________________________________________________\n";
    result += String.format("|%12s%-8d|%-14s%-6d|%15b|%n", "Integer a = ", a, "Integer a_1 = ", a_1, (a.equals(a_1)));
    result += "___________________________________________________________\n";
    result += String.format("|%-11s%-9.1f|%-13s%-7.1f|%15b|%n", "Double b = ", b, "Double b_1 = ", b_1, (b.equals(b_1)));
    result += "___________________________________________________________\n";
    result += String.format("|%-11s%-9s|%-13s%-7s|%15b|%n", "String a = ", c, "String c_1 =", c_1, (c.equals(c_1)));
    result += "___________________________________________________________\n";

    return result;

}
    public static void task(int a) {
        String lb = "<<<<<<< <<<<<<<<<<<<<<<<<<<<<<<<<";
        String task = " Task #  ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + a + rb);
    }
}

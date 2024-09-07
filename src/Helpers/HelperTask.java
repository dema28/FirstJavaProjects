package Helpers;


public class HelperTask {
    public static void task(int a) {
        String lb = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        String task = " Task #  ";
        String rb = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.println(lb + task + a + rb);
    }

    public static void pincod ( int l) {
        int index = 0;

        for (int i = 0; index < l; i += 2) {

                System.out.println(i);
                index ++;
        }
    }

    public static String qwerty (){
        String resul1 = "";
        String resul2 = "";
        String resul3 = "";
        String resul4 = "";
        for (int i = 0; i <=9; i++) {
            resul1 = resul1 + i;
            resul2 = resul2 + i+i;
            resul3 = resul3 + i+i+i;
            resul4 = resul4 + i+i+i+i;
        }
        return resul1+resul2+resul3+resul4;
    }


    public static void task3 (int num) {
        System.out.print(0);
        for (int i = 1; i < num; i++) {
            System.out.print(", " + i+", "+(i*-1));
        }
    }


    public static void task4 (int nik){
        for (int i = 0; i <= nik; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void lineNumbers (int n, int m, int l) {
        int index = 0;
        for (int i = n; index < l; i = i + m) {
            if(i % 2 !=0){
                System.out.print(i + " ");
                index ++;
            }
        }
    }
}



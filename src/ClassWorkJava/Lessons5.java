package ClassWorkJava;

import java.util.Arrays;

public class Lessons5 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 =arr1;
        int [] arr3 =arr2;
                arr2[0] = -1;
                arr1[3] = -4;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}

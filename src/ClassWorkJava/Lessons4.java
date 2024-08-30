package ClassWorkJava;

public class Lessons4 {
    public static void main(String[] args) {

        double[] julyRiders = {15.0, 21.8, 20.5, 18.2};
        System.out.println(julyRiders);
        double total = 0;
        for (int index = 0; index < julyRiders.length; index++) {
            System.out.println(julyRiders[index]);
            total = total + julyRiders[index];
            System.out.println("total sa far: " + total);
        }
        System.out.println("Total in July: " + total);
    }
}

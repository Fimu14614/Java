
import java.lang.Math;

public class Math3 {

    private static int i;

    public static void main(String[] args) {

        for (i = 0; i <= 5; i++) {
            int number = (int) (Math.random() * 200);
            System.out.println("Random number:" + number);

        }

    }
}

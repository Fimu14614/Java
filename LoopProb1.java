package loopprob1;

public class LoopProb1 {

    public static void main(String[] args) {
        System in = new Scanner(System.in);
        System.out.println("input the number:");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }

}

package fimuevenodd;

import java.util.Scanner;

public class Fimuevenodd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Array Elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Fimuevenodd num = new Fimuevenodd();

        System.out.println("Even Numbers: " + fimuEven(arr));
        System.out.println("Odd Numbers: " + num.fimuOdd(arr));

    }

    public static int fimuEven(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                x++;
            }
        }
        return x;
    }

    public int fimuOdd(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                x++;
            }
        }
        return x;
    }

}

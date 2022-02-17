package upercase.lowercase;

import java.util.Scanner;

public class UpercaseLowercase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x, y;
        System.out.println("enter the first string:");
        x = in.nextLine();
        System.out.println("enter the second string:");
        y = in.nextLine();
        System.out.println("uper case of x: " + x.toUpperCase());
        System.out.println("uper case of x: " + x.toLowerCase());
        System.out.println("uper case of y: " + y.toUpperCase());
        System.out.println("uper case of y: " + y.toLowerCase());

    }

}

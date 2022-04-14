package project;

import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        System.out.print("Username:");
        username = input.nextLine();
        System.out.print("Password:");
        password = input.nextLine();

        if (username.equals("Fimu") && password.equals("Siyam123")) {
            System.out.println("            Welcome to Student Managemnet");
        } else {
            System.out.println("Wrong username or password");
            return;
        }

        System.out.println("How many students you want to enroll ?:");
        Scanner in = new Scanner(System.in);
        int numberofstudents = in.nextInt();
        Student[] students = new Student[numberofstudents];

        for (int n = 0; n < numberofstudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].paybalance();
            System.out.println(students[n].StudentInformation());
        }
    }

}

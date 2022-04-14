package project;

import java.util.Scanner;

public class Student {

    private String Firstname;
    private String Lastname;
    private int studentID;
    private int amount;
    private int Semester;
    private int Batchno;
    private String Section;
    private String courses;
    private int costofcourse = 5000;
    private int totalbalance = 0;
    
    Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter First Name: ");
        this.Firstname = in.nextLine();

        System.out.print("Enter Last Name: ");
        this.Lastname = in.nextLine();

        System.out.print("Enter Semester No: ");
        this.Semester = in.nextInt();

        System.out.print("Enter Batch No: ");
        this.Batchno = in.nextInt();

        System.out.print("Enter StudentID: ");
        this.studentID = in.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Section Name: ");
        this.Section = sc.nextLine();

        System.out.println("Student Name:" + Firstname + " " + Lastname + " ");

        System.out.println("Semester:" + Semester);

        System.out.println("Batch No:" + Batchno);

        System.out.println("Student ID:" + studentID);

        System.out.println("Section Name:" + Section);

    }

    public void enroll() {
        System.out.println("Press s to stop enrollment");
        do {
            System.out.println("Enter course to enroll:");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("s")) {
                courses = courses + "\n    " + course;
                totalbalance = totalbalance + costofcourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in:" + courses);
        System.out.println("Total balance:" + totalbalance);

    }

    
    

    public void paybalance() {
       
        System.out.print("How much you want to pay?:");
        Scanner in = new Scanner(System.in);
        amount = in.nextInt();
        totalbalance = totalbalance - amount;

    }
public void duebalance() {
        System.out.println("Your due balance is:" + totalbalance);
}
    public String StudentInformation() {
        

        return "\n\nName: " + Firstname + " " + Lastname
                + "\nSemester No: " + Semester
                + "\nBatch No No: " + Batchno
                + "\nStudent ID: " + studentID
                + "\nSection Name: " + Section
                + "\nYou have enrolled these courses:" + courses
                + "\nPaid Balance: " + amount
                + "\nDue Balance: " + totalbalance;
        

    }
}

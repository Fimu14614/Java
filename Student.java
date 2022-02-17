
package student;


public class Student {

    
    private String name;
    private int Id;
    private double cgpa;

    public void insertRecord(String name, int Id, double cgpa) {

        this.name = name;
        this.Id = Id;
        this.cgpa = cgpa;
    }

    public void displayRecord() {

        System.out.println("Name: " + name);
        System.out.println("Id: " + Id);
        System.out.println("CGPA: " + cgpa);
    }
    

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord("X", 14570, 3.00);
        s1.displayRecord();
        Student s2 = new Student();
        s2.insertRecord("Y", 14569, 3.70);
        s2.displayRecord();
        Student s3 = new Student();
        s3.insertRecord("Z", 14568, 3.50);
        s3.displayRecord();
        Student s4 = new Student();
        s4.insertRecord("A", 14559, 3.40);
        s4.displayRecord();

    }
}

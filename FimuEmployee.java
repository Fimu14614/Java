package fimuemployee;

public class FimuEmployee {

    private String empName;
    private int empId;
    private String designation;
    private double salary;

    public void insertRecord(String empName, int empId, String designation, int salary) {
        this.empName = empName;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;

    }

    public void displayRecord() {

        System.out.println("Name: " + empName);
        System.out.println("Id: " + empId);
        System.out.println("designation: " + designation);
        System.out.println("salary: " + salary);

    }

    public static void main(String[] args) {

        FimuEmployee e1 = new FimuEmployee();
        e1.empName = "Fimu";
        e1.empId = 2111514614;
        e1.designation = "Exicutive";
        e1.salary = 70000;
        e1.displayRecord();
        FimuEmployee e2 = new FimuEmployee();
        e2.empName = "Siyam";
        e2.empId = 2111514588;
        e2.designation = "manager";
        e2.salary = 20000;
        e2.displayRecord();
        FimuEmployee e3 = new FimuEmployee();
        e3.empName = "Torekul";
        e3.empId = 2111514613;
        e3.designation = "Driver";
        e3.salary = 15000;
        e3.displayRecord();

    }

}

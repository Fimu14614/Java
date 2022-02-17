
package method;

import java.util.Scanner;


public class Method {

    
    public static void addition() {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum;
        sum=x+y;
        System.out.println("Sum:" +sum);
    }
    public static void substraction() {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum;
        sum=x-y;
        System.out.println("Sum:" +sum);
    }
    public static void multiplication() {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum;
        sum=x*y;
        System.out.println("Sum:" +sum);
    }
    public static void division() {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum;
        sum=x/y;
        System.out.println("Sum:" +sum);
    }
        public static void main(String[]args){
            addition();
            substraction();
            multiplication();
            division();
            
                    
        
        
    }
    
}


package merge;

import static java.lang.System.in;
import java.util.Scanner;


public class Merge {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String x, y, z,merge;
        System.out.println("enter the 1st element:");
        x=in.nextLine();
        System.out.println("enter the 2nd element:");
        y= in.nextLine();
        System.out.println("enter the 3rd element:");
        z= in.nextLine();
        merge= x . concat (y);
        merge= merge . concat (z);
        System.out.println(" merge : " + merge);
        
        
    }
    
}

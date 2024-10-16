package status;

import java.util.Scanner;

/** This class takes input from the user 
 * and calls the method statusDetail to print the 
 * status of User-Rejected, Pending, Processing, and Approved.
 * The code has been changed to use enums to avoid String input 
 * and print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (zero, one, two, three):");

        try {
            StausUser.StatusCode code = StausUser.StatusCode.valueOf(in.next().toUpperCase());

            StausUser t = new StausUser();
            t.statusDetail(code);  
        } catch (IllegalArgumentException e) {

            System.out.println("Invalid input. Please enter zero, one, two, or three.");
        }
    }
}

package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    // Enum definition for status codes
    public enum StatusCode {
        ZERO, ONE, TWO, THREE
    }

    // Modify the method to accept the enum instead of a String
    public void statusDetail(StatusCode code) {
        switch (code) {
            case ZERO:
                System.out.println("REJECTED");
                break;
            case ONE:
                System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case THREE:
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}

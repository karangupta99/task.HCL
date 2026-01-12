package assignment2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation {

	 static Scanner sc = new Scanner(System.in);

	    // REGEX Patterns
	    static final String MOBILE_REGEX = "^[6-9][0-9]{9}$";
	    static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    static final String USERNAME_REGEX = "^[a-zA-Z0-9_]{5,15}$";
	    static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$!]).{8,}$";

	    public static void main(String[] args) {

	        while (true) {
	            try {
	                System.out.println("\n--- REGEX VALIDATION MENU ---");
	                System.out.println("1. Validate Mobile Number");
	                System.out.println("2. Validate Email ID");
	                System.out.println("3. Validate Username");
	                System.out.println("4. Validate Password");
	                System.out.println("5. Exit");
	                System.out.print("Enter your choice: ");

	                int choice = sc.nextInt();
	                sc.nextLine(); 

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter Mobile Number: ");
	                        validateInput(sc.nextLine(), MOBILE_REGEX);
	                        break;

	                    case 2:
	                        System.out.print("Enter Email ID: ");
	                        validateInput(sc.nextLine(), EMAIL_REGEX);
	                        break;

	                    case 3:
	                        System.out.print("Enter Username: ");
	                        validateInput(sc.nextLine(), USERNAME_REGEX);
	                        break;

	                    case 4:
	                        System.out.print("Enter Password: ");
	                        validateInput(sc.nextLine(), PASSWORD_REGEX);
	                        break;

	                    case 5:
	                        System.out.println("Thank You! Program Exited.");
	                        System.exit(0);

	                    default:
	                        System.out.println("Invalid choice!");
	                }

	            } catch (Exception e) {
	                System.out.println("Error: Invalid Input");
	                sc.nextLine(); 
	            }
	        }
	    }

	    
	    static void validateInput(String input, String regex) {
	        if (Pattern.matches(regex, input)) {
	            System.out.println("✅ Welcome! Input is valid.");
	        } else {
	            System.out.println("❌ Invalid input!");
	        }
	    }
}



import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class Assignment22 {
	
	 static String mobileRegex = "^[6-9][0-9]{9}$";
	    static String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    static String usernameRegex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
	    static String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int choice = 0;

	        try {
	            do {
	                System.out.println("\n---- REGEX VALIDATION MENU ----");
	                System.out.println("1. Validate Mobile Number");
	                System.out.println("2. Validate Email ID");
	                System.out.println("3. Validate Username");
	                System.out.println("4. Validate Password");
	                System.out.println("5. Exit");
	                System.out.print("Enter your choice: ");

	                choice = sc.nextInt();
	                

	                switch (choice) {

	                    case 1:
	                        System.out.print("Enter Mobile Number: ");
	                        String mobile = sc.nextLine();
	                        validate(mobile, mobileRegex, "Mobile Number");
	                        break;

	                    case 2:
	                        System.out.print("Enter Email ID: ");
	                        String email = sc.nextLine();
	                        validate(email, emailRegex, "Email ID");
	                        break;

	                    case 3:
	                        System.out.print("Enter Username: ");
	                        String username = sc.nextLine();
	                        validate(username, usernameRegex, "Username");
	                        break;

	                    case 4:
	                        System.out.print("Enter Password: ");
	                        String password = sc.nextLine();
	                        validate(password, passwordRegex, "Password");
	                        break;

	                    case 5:
	                        System.out.println("Thank You! Program Terminated.");
	                        break;

	                    default:
	                        System.out.println("Invalid Choice!");
	                }

	            } while (choice != 5);

	        } catch (InputMismatchException e) {
	            System.out.println("Invalid Input! Please enter numbers only.");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }

	    //  validation method 
	    static void validate(String input, String regex, String fieldName) {
	        if (Pattern.matches(regex, input)) {
	            System.out.println("Valid " + fieldName + ". Welcome!");
	        } else {
	            System.out.println("Invalid " + fieldName + "!");
	        }
	    }
}

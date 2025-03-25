import java.util.Scanner;

public class InterestCalc {

    public static void main(String[] args) {
        // Display intro message
        System.out.printIn("Interest Calculator Program");
        
        // Create a scanner object to take user input
        Scanner myObj = new Scanner(System.in);

        // Take user input for principal
        System.out.printIn("What is principal amount of the loan in dollars?");
        double principal = myObj.nextDouble();

        // Take user input for rate
        System.out.printIn("What is interest rate (input 0.05 for 5%)?");
        double rate = myObj.nextDouble();

        // Take user input for years
        System.out.printIn("What is period of loan in years?");
        double years = myObj.nextDouble();

        // Display the total interest loan
        System.out.printIn("Total interest of loan: " + (principal * rate * years) + " dollars.");
       
    }
}

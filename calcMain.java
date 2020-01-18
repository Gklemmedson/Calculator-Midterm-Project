import java.lang.*;
import java.util.InputMismatchException; 
import java.util.*;

/**This is a calculator app. It can handle addition, subtraction, multiplication, 
 * division, raising a number to a power, and nth root division.
 * This is the main class, named calcMain.
 * @author Klemm
 *
 */

public class calcMain {
	

	//This is the main method, it will call upon the calculation class.
	
	public static void main(String[] args) throws ArithmeticException{
	//Declaring and initializing the following variables for later use.
	
		
	double numberOneFinal = 0;
	double numberTwoFinal = 0;
	double answer = 0;
	//char operationFinal = 0;
	//double numTwoConv = 0;
	//Declaring a boolean statement to make a loop in case of errors.
	//boolean continueLoop = true;
	//making the scanner object so the user can input data.
	Scanner scanner = new Scanner (System.in);
	//This is where the user is asked to enter their first number, they can type PI
	//if they desire to use the mathematical constant pi.
	System.out.printf("Please enter your first number, or PI: ");
	//Declaring and setting a variable known as numOne equal to whatever the user inputs
	//nextLine() will take any string
	String numberOne = scanner.nextLine();
	
	//do {
		try {
			//The class ExceptionHandling will take in the variable numOne and utilize a 
			//conversion method.
			//@param numberOne - this will be the first input of the user
			StringConversion.convertString(numberOne);
			numberOneFinal = Double.parseDouble(numberOne);
			if (numberOneFinal < 0) {
				throw new ArithmeticException("numbers cannot be negative");
			}
			//User is asked for their second number.
			System.out.printf("\n\nPlease enter your second number, or PI: ");
			String numberTwo = scanner.nextLine ();
			//Second number goes through the same class and conversion method as the first.
			//@param numberTwo - this will be the user's second input of the user
			StringConversion.convertString(numberTwo);
			numberTwoFinal = Double.parseDouble(numberTwo);
			if (numberTwoFinal < 0) {
				throw new ArithmeticException("numbers cannot be negative");
			}
			//User is asked what operation they want to use. 
			System.out.printf("\n\nWhat operation would you like to use?"); 
			//declaring a char variable known as operation.
			char operation = scanner.next().charAt(0);
			System.out.println(operation);
			//Making a new calculation Object 
			//@param numberOneFinal - the converted form of the user's first input
			//@param numberTwoFinal - the converted form of the user's first input
			Calculation calculation = new Calculation (numberOneFinal, numberTwoFinal);
			//making a switch statement to handle whatever character the user wants for their operation
			//passing in the operation char from the user as a parameter
			//calling on methods from the Calculations class
			
			//System.out.println(numberOneFinal);
			switch (operation) {
			case '+': 
				answer = calculation.add();
				break;
			case '-':
				answer = calculation.subtract();
				break;
			case '*':
				answer = calculation.multiply();
				break;
			case '/':
				answer = calculation.divide();
				break;
			case '%':
				answer = calculation.modulo();
				break;
			case '^':
				answer = calculation.pow();
				break;
			case 'R':
				answer = calculation.root();
				break;
				
			}
			//Printing out the answer and closing the scanner
			System.out.println("\nYour answer is: " + answer);
			scanner.close();
		}
		catch (InputMismatchException inputMismatch) {
			System.err.printf("%nException: %s%n", inputMismatch);
			scanner.nextLine();//discard input, so user can try again
			System.out.printf("You must enter a numeric value, PI, or help. Also, no negative numbers.");
		}
		catch (ArithmeticException arithmeticException) {
				System.err.printf("%nException: %s%n", arithmeticException);
		//}
		//catch (Exception e) {
			//System.out.println("Unhandled exception.\n");
		}
	
	}
}



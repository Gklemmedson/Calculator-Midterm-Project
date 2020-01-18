//This class is used to convert the user's input from a string to a double
public class StringConversion {
	//@param userInput - the user's input
public static double convertString(String userInput) {
		
		double numberIsPi = 0;
		double numberIsFinal = 0;
		
		//this if statement is intended to be used if the user wants to use PI as a number variable.
		if (userInput.equalsIgnoreCase("PI")) {
			numberIsPi = Math.PI;
			numberIsFinal = numberIsPi;
			//return Math.PI;
		//the following System.out.print will confirm that the user has entered pi, and it will display the number.
			//System.out.print("The scanner is set to string and converted to PI: " + numberIsFinal);
		//this part of the if statement is used as a short "help" command, giving very basic instructions
		} else if (userInput.equalsIgnoreCase("help")) {
			System.out.println("This is the help command. Please try entering any number, or if you would like to use pi as a number, please type PI. Also, no negative numbers.");
		} else {
		//this is that "catch all" of the if statement. it is indented to be used only to parse the number variable from a string and turn it into a double.
			numberIsFinal = Double.parseDouble(userInput);
			System.out.print("The scanner is set to string and converted to double: " + numberIsFinal);
		}
		//@return numberIsFinal - This will be the value of the user's input, converted into a double so it is usable
		return numberIsFinal;
	}
	
	
	
	

}

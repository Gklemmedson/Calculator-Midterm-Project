
import java.util.InputMismatchException;
import java.lang.Math;
import java.lang.*;


/**This is the Calculation class. It naturally extends the default java Object.
 * It implements the operations interface. We will use all the operations here.
 * @author Klemm
 *
 */
public class Calculation implements Operable {
	//declared as private to ensure encapsulation. 
	//firstVariable will be the user's first number that they enter in the scanner, in the main method.
	//secondVariable will be the second.
	private double firstVariable;
	private double secondVariable;
	
	//This is the public class Calculation. it is public so we can use it in the main method
	//The parameters ensure that it has two numbers to calculate, both as doubles.
	/*
	 * @param firstVariable - the first variable that will be use in the calculation
	 * @param secondVariable - the second variable that will be used in the calculation
	 */
	public Calculation (double firstVariable, double secondVariable){
		setFirstVariable(firstVariable);
		setSecondVariable(secondVariable);
	}
	
	//Using multiple override methods to make the scanner inputs from the main method
	//go through the following calculations for them.
	//Each method will return the outcome of that calculation.
	@Override
	public double add() {
		double outcome = firstVariable + secondVariable;
		return outcome;
	
	}
	@Override
	public double subtract() {
		double outcome = firstVariable - secondVariable;
		return outcome;
		
	}
	@Override
	public double multiply() {
		double outcome = firstVariable * secondVariable;
		return outcome;
		
	}
	@Override
	public double divide() {
		double outcome = firstVariable / secondVariable;
		return outcome;
		
	}
	@Override
	public double modulo() {
		double outcome = firstVariable % secondVariable;
		return outcome;
	}
	@Override
	public double pow() {
		//@param firstVaraible - the first number that will be passes through Math.pow
		//@param secondVariable - the second number that will be passed through Math.pow
		double outcome = Math.pow(firstVariable, secondVariable);
		return outcome;
		
	}
	@Override
	public double root() {
	         
	       double randomValue = Math.random() % 10; 
	      
	        // smaller eps, denotes more accuracy 
	        double accSetting = 0.00000001; 
	      
	        // initializing difference between two 
	        // roots by INT_MAX 
	        double max = Double.MAX_VALUE; 
	      
	        // outcome denotes current value of x 
	        double outcome = 0.0; 
	      
	        // loop until we reach desired accuracy 
	        while (max > accSetting) 
	        { 
	            // calculating current value from previous 
	            // value by newton's method 
	            outcome = ((firstVariable - 1.0) * randomValue + 
	            (double)secondVariable  / Math.pow(randomValue, firstVariable - 1)) / (double)firstVariable; 
	            max = Math.abs(outcome - randomValue); 
	            randomValue = outcome;
	        }
	    //@return outcome - the value of the final outcome
		return outcome;
		}
	//The Getters and Setters for our private variables. 
	//We are using this to again, ensure encapsulation of the variables.
	public double getFirstVariable() {
		return firstVariable;
	}
	//@param firstVariable - the user's first number variable
	public void setFirstVariable(double firstVariable) {
		this.firstVariable = firstVariable;
	}
	public double getSecondVariable() {
		return secondVariable;
	}
	//@param secondVariable - the user's first number variable
	public void setSecondVariable(double secondVariable) {
		this.secondVariable = secondVariable;
	}
	
	
	
	
	
	
	
	
	
}

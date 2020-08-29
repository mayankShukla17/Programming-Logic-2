package Programming_Logic_2;
/*
 * Problem1: Develop a calculator using switch case
 * Get two numbers of a type of integer or double from 
 * the user and perform the operation(Add, Multiply, Divide, Subtract)
 * selected by the user using switch case, if-else 
 * statement, break and looping switch case using recursion
 */
import java.util.Scanner;
public class ProblemOne {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers.");
		double numberOne=scanner.nextDouble();
		double numberTwo=scanner.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator =scanner.next().charAt(0);
		double result;
		switch(operator){
		case '+':
			result = numberOne + numberTwo;
			break;
		case '-':
			result = numberOne - numberTwo;
			break;
		case '*':
			result = numberOne * numberTwo;
			break;
		case '/':
			result = numberOne / numberTwo;
			break;
		default:
			System.out.printf("Error! operator is not correct");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", numberOne, operator, numberTwo, result);
	}
}

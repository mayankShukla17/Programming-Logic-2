package Programming_Logic_2;
//Problem2: ​ Given four integers sort them in ascending order using if-else statement
import java.util.Scanner;
public class ProblemTwo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		int valueOne=scanner.nextInt();
		int valueTwo=scanner.nextInt();
		int valueThree=scanner.nextInt();
		int valueFour=scanner.nextInt();
		int temp;
	    if (valueOne > valueTwo){
	        temp = valueOne;
	        valueOne = valueTwo;
	        valueTwo = temp;
	    }  
	    if (valueTwo > valueThree){
	        temp = valueTwo;
	        valueTwo = valueThree;
	        valueThree = temp;
	    } 
	    if (valueThree > valueFour){
	        temp = valueThree;
	        valueThree = valueFour;
	        valueFour = temp;
	    }
	     if (valueOne > valueTwo){
	        temp = valueOne;
	        valueOne = valueTwo;
	        valueTwo = temp;
	    } 
	    if (valueTwo > valueThree){
	        temp = valueTwo;
	        valueTwo = valueThree;
	        valueThree = temp;
	    } 
	    if (valueOne > valueTwo){
	        temp = valueOne;
	        valueOne = valueTwo;
	        valueTwo = temp;
	    }
	   System.out.println("Sorted Number: "+valueOne+" "+valueTwo+" "+valueThree+" "+valueFour);
	}
}

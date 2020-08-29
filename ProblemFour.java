package Programming_Logic_2;
/*Problem4:Find whether the given number is a Strong Number or not.
 * Strong Numbers are the numbers whose sum of the factorial of digits 
 * is equal to the original number.
*/
import java.util.Scanner;
public class ProblemFour{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		boolean result=isStrong(number);
		if(result)
			System.out.println(number+" is Strong  No ");
		else
			System.out.println(number+" is not a Strong No ");
	}
	
	public static boolean isStrong(int number){
		int sum=0,temp=number;
		do{
			int remainder = number%10;
			sum=sum+fact(remainder);
			number=number/10;
		}while(number!=0);
		return sum==temp;
	}
	
	public static int fact(int number){
		int factorial=1;
		while(number>1){
			factorial=factorial*number;
			number--;
		}
		return factorial;
	}
}
package Programming_Logic_2;
/*Program 11: ​ Write a program which accepts an integer number as input from the user
and perform the following conditional checks:
a. Print Tom if the number is odd and exists between 20 to 30
b. Print Jerry, if the number is even and exists between 20 and 30
 */
import java.util.Scanner;
public class Problem11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2!=0 && n>=20 && n<=30) 
			System.out.println("Tom");
		else if(n%2==0 && n>=20 && n<=30) 
			System.out.println("Jerry");
		else 
			System.out.println("Invalid number");
	}
}

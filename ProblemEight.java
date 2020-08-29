package Programming_Logic_2;
/*Problem 8: ​ Write a program to print the following :
     *
    **
   ***
  ****
 *****
 */
import java.util.Scanner;
class ProblemEight{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println(" Enter the no ");
		int size=scanner.nextInt();

		for (int i=1;i<=size;i++) {
			for (int j=1;j<=size-i;j++) 
				System.out.print(" ");
			for (int j=1;j<=i;j++) 
				System.out.print("*");	
			System.out.println();
		}
	}
}
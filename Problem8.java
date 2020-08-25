package Programming_Logic_2;
/*Problem 8: ​ Write a program to print the following :
 		*
 	   **
 	  ***
 	 ****
 	*****
*/
import java.util.Scanner;
class Problem8{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the no ");
		int n=sc.nextInt();

		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
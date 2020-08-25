package Programming_Logic_2;
/*Program 12:​ Write a program using a loop to print the following output. 
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
 * Input: 5
 * Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
*/
import java.util.Scanner;
public class Problem12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of iterations you want");
		int n=sc.nextInt();
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
		}
	}
}

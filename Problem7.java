package Programming_Logic_2;
/*Problem 7: ​ Write a program, which reads a number of students and n grades as input (of
int between 0 and 100, inclusive) and displays the average, minimum, and maximum. Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.
Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77
The average is 81.50
The minimum is 65
The maximum is 98
*/
import java.util.Scanner;
public class Problem7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < n; i++) {
			int j=i+1;
			System.out.print("Enter the grade for student "+j+": ");
			ar[i]=sc.nextInt();
		}
		double avg=averageGrade(ar);
		System.out.println("The average is "+avg);
		int min=minimumGrade(ar);
		System.out.println("The minimum is "+min);
		int max=maximumGrade(ar);
		System.out.println("The maximum is "+max);
	}
	public static double averageGrade(int ar[]) {
		double avg=0;
		double sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum+=ar[i];
		}
		avg=sum/ar.length;
		return avg;
	}
	public static int minimumGrade(int ar[]) {
		int min=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(min>ar[i])
				min=ar[i];
		}
		return min;
	}
	public static int maximumGrade(int ar[]) {
		int max=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(max<ar[i])
				max=ar[i];
		}
		return max;
	}
}

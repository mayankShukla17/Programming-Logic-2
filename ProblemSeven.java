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
public class ProblemSeven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size=scanner.nextInt();
		int array[]=new int[size];
		for (int i = 0; i < size; i++) {
			int j=i+1;
			System.out.print("Enter the grade for student "+j+": ");
			array[i]=scanner.nextInt();
		}
		double average=averageGrade(array);
		System.out.println("The average is "+average);
		int minimum=minimumGrade(array);
		System.out.println("The minimum is "+minimum);
		int maximum=maximumGrade(array);
		System.out.println("The maximum is "+maximum);
	}
	public static double averageGrade(int array[]) {
		double average=0;
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		average=sum/array.length;
		return average;
	}
	public static int minimumGrade(int array[]) {
		int minimum=array[0];
		for (int i = 0; i < array.length; i++) {
			if(minimum>array[i])
				minimum=array[i];
		}
		return minimum;
	}
	public static int maximumGrade(int array[]) {
		int maximum=array[0];
		for (int i = 0; i < array.length; i++) {
			if(maximum<array[i])
				maximum=array[i];
		}
		return maximum;
	}
}

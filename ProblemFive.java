package Programming_Logic_2;
import java.util.Scanner;
//Problem 5: ​ Finding the sum of common elements from given two arrays.
public class ProblemFive{
	public int size(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the size of your array.");
		int size=scanner.nextInt();
		return size;
	}
	
	public int[] readArr(){
		Scanner scanner = new Scanner(System.in);
		int size=size();
		int array []=new int[size];
		System.out.println("Enter " + size + " values. " );
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		return array;
	}
	
	public int sumCommonArray(int array1[],int array2[]) {
		int sum=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i]==array2[j]) {
					sum+=array1[i];
				}
			}
		}
		return sum;
	}
	
	public void dispArr(int array[]){
		for (int i = 0; i < array.length; i++){
			if (i<array.length-1)
				System.out.print(array[i]+ ",");
			else
				System.out.println(array[i]);
		}
	}
	
	public void output(int result) {
		System.out.println("Sum of common array elements "+result);
	}
	
	public static void main(String[] args) {
		ProblemFive problem=new ProblemFive();
		System.out.println(" Enter first array. ");
		int array1[]=problem.readArr();
		System.out.println(" Enter second array. ");
		int array2[]=problem.readArr();
		
		System.out.println(" Entered first array. ");
		problem.dispArr(array1);
		System.out.println(" Entered second array. ");
		problem.dispArr(array2);
		problem.output(problem.sumCommonArray(array1, array2));
	}
}

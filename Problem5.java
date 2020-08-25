package Programming_Logic_2;
import java.util.Scanner;
//Problem 5: ​ Finding the sum of common elements from given two arrays.
public class Problem5 {
	public int size() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the size of your array.");
		int n=sc.nextInt();
		return n;
	}
	
	public int[] readArr() 
	{
		Scanner sc = new Scanner(System.in);
		int n=size();
		int ar[]=new int[n];
		System.out.println("Enter " + n + " values. " );
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	public int sumCommonArray(int a[],int b[]) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					sum+=a[i];
				}
			}
		}
		return sum;
	}
	
	public void dispArr(int ar[]) 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			if (i<ar.length-1)
				System.out.print(ar[i]+ ",");
			else
				System.out.println(ar[i]);
		}
	}
	
	public void output(int result) {
		System.out.println("Sum of common array elements "+result);
	}
	
	public static void main(String[] args) {
		Problem5 p=new Problem5();
		System.out.println(" Enter first array. ");
		int a[]=p.readArr();
		System.out.println(" Enter second array. ");
		int b[]=p.readArr();
		
		System.out.println(" Entered first array. ");
		p.dispArr(a);
		System.out.println(" Entered second array. ");
		p.dispArr(b);
		p.output(p.sumCommonArray(a, b));
	}
}

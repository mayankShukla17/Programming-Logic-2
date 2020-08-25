package Programming_Logic_2;
import java.util.Arrays;
/*Problem3: ​ Given a sorted array of positive integers, rearrange the array alternately 
i.e first element should be a maximum value, second minimum value, third-second max,
fourth-second min and so on
*/
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Before Meandering");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		Arrays.sort(ar);
		System.out.println();
		int br[]=new int[ar.length];
		int k=0;
		for (int i=0, j=ar.length-1; i<=j; i++, j--) 
		{
			br[k++]=ar[j];
			if(k<br.length)
				br[k++]=ar[i];
		}
		System.out.println("After Meandering");
		for (int i = 0; i < br.length; i++) 
		{
			System.out.print(br[i]+" ");
		}
	}
}

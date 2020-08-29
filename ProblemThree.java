package Programming_Logic_2;
import java.util.Arrays;
/*Problem3: ​ Given a sorted array of positive integers, rearrange the array alternately 
i.e first element should be a maximum value, second minimum value, third-second max,
fourth-second min and so on
*/
import java.util.Scanner;
public class ProblemThree {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter "+size+" values");
		for (int i = 0; i < array.length; i++) 
			array[i]=scanner.nextInt();
		System.out.println("Before Meandering");
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i]+" ");
		Arrays.sort(array);
		System.out.println();
		int newArray[]=new int[array.length];
		int k=0;
		for (int i=0, j=array.length-1; i<=j; i++, j--){
			newArray[k++]=array[j];
			if(k<newArray.length)
				newArray[k++]=array[i];
		}
		System.out.println("After Meandering");
		for (int i = 0; i < newArray.length; i++) 
			System.out.print(newArray[i]+" ");
	}
}

package Programming_Logic_2;
/*Program 9: ​ Given an array of ints, return the number of 9's in the array.
	arrayCount9([1, 2, 9]) → 1
	arrayCount9([1, 9, 9]) → 2
	arrayCount9([1, 9, 9, 3, 9]) → 3
*/
public class ProblemNine {
	public static void main(String[] args) {
		int array1[]={1, 2, 9};
		int array2[]={1, 9, 9};
		int array3[]={1, 9, 9, 3, 9};
		int count=arrayCount9(array1); 
		System.out.println("Count of 9 "+count);
		count=arrayCount9(array2);
		System.out.println("Count of 9 "+count);
		count=arrayCount9(array3);
		System.out.println("Count of 9 "+count);
	}
	public static int arrayCount9(int array[]) {
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==9) 
				count++;
		}
		return count;
	}
}

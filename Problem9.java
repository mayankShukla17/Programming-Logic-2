package Programming_Logic_2;
/*Program 9: ​ Given an array of ints, return the number of 9's in the array.
	arrayCount9([1, 2, 9]) → 1
	arrayCount9([1, 9, 9]) → 2
	arrayCount9([1, 9, 9, 3, 9]) → 3
*/
public class Problem9 {
	public static void main(String[] args) {
		int arr[]={1, 2, 9};
		int brr[]={1, 9, 9};
		int crr[]={1, 9, 9, 3, 9};
		int n=arrayCount9(arr); 
		System.out.println("Count of 9 "+n);
		n=arrayCount9(brr);
		System.out.println("Count of 9 "+n);
		n=arrayCount9(crr);
		System.out.println("Count of 9 "+n);
	}
	public static int arrayCount9(int ar[]) {
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]==9) {
				count++;
			}
		}
		return count;
	}
}

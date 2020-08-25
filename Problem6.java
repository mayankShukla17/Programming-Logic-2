package Programming_Logic_2;
/*Problem 6: ​ Given a positive number, find the length of the longest sequence of zeros in
the binary representation of a positive integer Conditional statements and loops
*/
import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positive number.");
		int n=sc.nextInt();
		int count=binaryGap(n);
		System.out.println("Length of longest Sequence of zeros "+count);
		
	}
	
	public static int binaryGap(final int n) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be positive; was " + n);
        final int start = Integer.lowestOneBit(n), end = Integer.highestOneBit(n);
        int curRun = 0, longestRun = 0;
        for (int bitmask = start; bitmask != end; bitmask <<= 1) {
            final int bit = n & bitmask;
            if (bit == 0)
                ++curRun;
            else {
                longestRun = Math.max(longestRun, curRun);
                curRun = 0;
            }
        }
        return Math.max(longestRun, curRun);
    }
}

package Programming_Logic_2;
/*Problem 6: ​ Given a positive number, find the length of the longest sequence of zeros in
the binary representation of a positive integer Conditional statements and loops
*/
import java.util.Scanner;
public class ProblemSix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the positive number.");
		int number=scanner.nextInt();
		int count=binaryGap(number);
		System.out.println("Length of longest Sequence of zeros "+count);
	}
	
	public static int binaryGap(final int number) {
        if (number <= 0)
            throw new IllegalArgumentException("n must be positive; was " + number);
        final int start = Integer.lowestOneBit(number), end = Integer.highestOneBit(number);
        int curRun = 0, longestRun = 0;
        for (int bitmask = start; bitmask != end; bitmask <<= 1) {
            final int bit = number & bitmask;
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

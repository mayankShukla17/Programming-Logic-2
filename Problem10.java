package Programming_Logic_2;
/*Program 10: ​ Write a program that accepts a number as input and check 
 * whether the given number is palindrome or not If it is a palindrome then
 * a. Add all the even numbers and check whether the sum is more than 25.
 * b. Print success and failure messages for all 3 conditions
 * Input: 2468642
 * Output: 2468642 is a palindrome and the sum of even numbers is greater than 25
 * Input: 12345
 * Output: 12345 is not a palindrome
 * Input: 12345654321
 * Output: 12345654321 is a palindrome and the sum of even numbers is less than 25
 */
import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		long n=sc.nextLong();
		if(isPalindrome(n)) {
			int sum=sumEvenDigits(n);
			if(sum>25) {
				System.out.println(n+" is a palindrome and the sum of even numbers is greater than 25");
			}
			else
				System.out.println(n+" is a palindrome and the sum of even numbers is less than 25");
		}
		else 
			System.out.println(n+" is not a palindrome");
	}

	public static int sumEvenDigits(long x) {
		int sum; 
		long lastDigit;
	     for(sum=0; x!=0; x/=10){
	         lastDigit = x%10;
	         if(lastDigit % 2 == 0)
	             sum += lastDigit;
	     }
	     return sum;
	}

	public static boolean isPalindrome(long x){
		long rev= 0,t=x;
		while(x!=0){
			long r = x%10;
			rev=rev*10+r;
			x=x/10;
		}
		return rev==t;
	}
}

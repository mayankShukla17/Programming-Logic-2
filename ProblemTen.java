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
public class ProblemTen {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number.");
		long number=scanner.nextLong();
		if(isPalindrome(number)) {
			int sum=sumEvenDigits(number);
			if(sum>25) 
				System.out.println(number+" is a palindrome and the sum of even numbers is greater than 25");
			else
				System.out.println(number+" is a palindrome and the sum of even numbers is less than 25");
		}
		else 
			System.out.println(number+" is not a palindrome");
	}

	public static int sumEvenDigits(long number) {
		int sum; 
		long lastDigit;
		for(sum=0; number!=0; number/=10){
			lastDigit = number%10;
			if(lastDigit % 2 == 0)
				sum += lastDigit;
		}
		return sum;
	}

	public static boolean isPalindrome(long number){
		long reverse= 0,temp=number;
		while(number!=0){
			long remainder = number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		return reverse==temp;
	}
}

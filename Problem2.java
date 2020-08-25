package Programming_Logic_2;
//Problem2: ​ Given four integers sort them in ascending order using if-else statement
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int temp;
	    if (a > b){
	        temp = a;
	        a = b;
	        b = temp;
	    }  
	    if (b > c){
	        temp = b;
	        b = c;
	        c = temp;
	    } 
	    if (c > d){
	        temp = c;
	        c = d;
	        d = temp;
	    }
	     if (a > b){
	        temp = a;
	        a = b;
	        b = temp;
	    } 
	    if (b > c){
	        temp = b;
	        b = c;
	        c = temp;
	    } 
	    if (a > b){
	        temp = a;
	        a = b;
	        b = temp;
	    }
	   System.out.println("Sorted Number: "+a+" "+b+" "+c+" "+d);
	}
}

package capg_Day1;
import java.util.*;
public class FindTheLargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);    
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		if(a>=b && a>=c)  
		System.out.println(a+" is the largest Number");  
		else if (b>=a && b>=c)  
		System.out.println(b+" is the largest Number");  
		else  
		System.out.println(c+" is the largest number");  
		}  
	}



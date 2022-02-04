package capg_Day1;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers:");
		int num1;
		int num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		int multi=num1*num2;
		System.out.println("Multiplication is: "+multi);
	}
}

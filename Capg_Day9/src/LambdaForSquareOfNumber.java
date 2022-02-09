import java.util.Scanner;

public class LambdaForSquareOfNumber {

	interface square{
		public void square(int a);
	}
	
	/*
	 * public void myMethod(int num) { int result=num*num; }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number to find Its Square:");
		num=sc.nextInt();
		square sq=(a)->
		{
			System.out.println("Square of "+a+" is: "+a*a);
		};
		sq.square(num);
	}
	
}

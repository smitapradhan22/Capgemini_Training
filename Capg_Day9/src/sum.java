import java.util.Scanner;

public class sum {
	interface SumOfNumber{
		public void summation(int num1,int num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();

		SumOfNumber s=(a,b)->
		{
			System.out.println(a+b);
		};
		s.summation(num1, num2);
		}
	}



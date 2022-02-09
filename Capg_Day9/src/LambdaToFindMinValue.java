import java.util.Scanner;
public class LambdaToFindMinValue {

	interface minNum{
		public void findMin(int num1,int num2);
	}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Number1:");
			int num1=sc.nextInt();
			System.out.println("Number2:");
			int num2=sc.nextInt();
			
			minNum minnum=(int a,int b)->
			{
				System.out.println("Min number : "+Math.min(a,b));
			};
			minnum.findMin(num1,num2);
		}
	}

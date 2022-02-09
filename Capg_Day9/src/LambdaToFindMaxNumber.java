import java.util.Scanner;

public class LambdaToFindMaxNumber {
interface maxNum{
	public void findMax(int num1,int num2);
}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Number1:");
		int num1=sc.nextInt();
		System.out.println("Number2:");
		int num2=sc.nextInt();
		
		
		maxNum maxnum=(int a,int b)->
		{
			System.out.println("Max number : "+Math.max(a,b));
		};
		maxnum.findMax(num1,num2);
	}
}

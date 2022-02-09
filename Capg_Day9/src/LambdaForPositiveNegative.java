import java.util.Scanner;

interface checkNum
{
	public void check(int num);
}

public class LambdaForPositiveNegative {
	 /*
	 * public void myMethod(int num) { if(num>0) { System.out.println("Positive"); }
	 * else { System.out.println("negative"); } }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number to find whether it it Positive or Negative:");
		num=sc.nextInt();
		
		checkNum myMethod=(int a)->
		{
			if(num>0) {
				System.out.println("Positive Number");
			}
			else
			{
				System.out.println("Negative Number");
			}
		};
		myMethod.check(num);
	}

}

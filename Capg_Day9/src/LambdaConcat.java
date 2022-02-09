import java.util.Scanner;

public class LambdaConcat {
interface concatString
{
	public void concatStr(String str1,String str2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String 1:");
		String str1=sc.next();
		System.out.println("Enter a String 2:");
		String str2=sc.next();
		
		concatString strings=(String a,String b)->
		{
			System.out.println("Concatination: "+ str1.concat(str2));
		};
		strings.concatStr(str1, str2);
	}

}

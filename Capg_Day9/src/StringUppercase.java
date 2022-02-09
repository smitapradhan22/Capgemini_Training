import java.util.Scanner;

public class StringUppercase {

interface mystring{
	public void uppercase(String a);
}

/*
 * public void uppercsemethod(String str) {
 * System.out.println(str.toUpperCase()); }
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to convert it into UpperCase:");
		String str=sc.next();
		
		mystring strtoUpper=(String a)->
		{
			System.out.println(str.toUpperCase());
		};
		strtoUpper.uppercase(str);
	}
}


import java.util.Scanner;

public class stringLength{

	interface mystring{
		public void length(String a);
	}

	/*
	 * public void uppercsemethod(String str) {
	 * System.out.println(str.length()); }
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String to find its length:");
			String str=sc.next();
			
			mystring strlength=(String a)->
			{
				System.out.println(str.length());
			};
			strlength.length(str);
		}
	}

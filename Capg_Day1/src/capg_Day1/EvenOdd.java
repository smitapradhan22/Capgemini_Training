package capg_Day1;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	    System.out.println("Enter a number:");

	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
	}


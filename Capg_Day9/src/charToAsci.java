import java.util.*;

interface CharToNumber
{
	public int asciiValue(char c1);
}
public class charToAsci {
	public static void main(String args[])
	{
		char c='A';
		CharToNumber c2n=(c1)->{
			
			int a=c;
			return a;
		};
		System.out.println("ASCII value of "+c+" is : "+c2n.asciiValue(c));
	}

}

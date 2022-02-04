package capg_Day2;
import java.util.*;
public class arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter array size: ");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<=size;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<=size;i++)
		{
			System.out.println(array[i]);
		}
	}

}

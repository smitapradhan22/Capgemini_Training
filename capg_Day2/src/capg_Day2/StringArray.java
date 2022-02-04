package capg_Day2;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		//create array
		String StrArray[]=new String[size];
		System.out.println("Enter String array elements:");
		//take array input
		for(int i=0;i<size;i++)
		{
			StrArray[i]=sc.next();
		}
		//print array elements
		System.out.println("Array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(StrArray[i]+" ");
		}
		
	}

}

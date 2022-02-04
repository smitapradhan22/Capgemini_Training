//Java Program to Calculate Average Using Arrays
package capg_Day2;

import java.util.Scanner;

public class AverageUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter array size: ");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int result=0;
		for(int i=0;i<size;i++)
		{
			result= result+array[i];
		}
		System.out.println("Average is: "+result/size);
	}

}

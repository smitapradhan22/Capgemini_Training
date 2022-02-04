//Java Program to Find Largest Element of an Array

package capg_Day2;

import java.util.Scanner;

public class LargestElementOfArray {

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
		int max=array[0];
		for(int i=0;i<size;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Largest Element in the Array is: "+max);
		
	}

}

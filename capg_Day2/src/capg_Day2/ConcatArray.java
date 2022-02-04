//Java Program to Concatenate Two Arrays
package capg_Day2;

import java.util.Scanner;

public class ConcatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter array size for array 1: ");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array elements for array 1:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int size2;
		System.out.println("Enter array size for array 2: ");
		size2=sc.nextInt();
		int array2[]=new int[size2];
		System.out.println("Enter array elements for array 2:");
		for(int i=0;i<size2;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		//concat
		int arrayMerge[]=new int[size+size2];
		//arrayMerge[]=array[i]+array2[];
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			arrayMerge[count]=array[i];
			count++;
		}
		
		for(int i=0;i<array2.length;i++)
		{
			arrayMerge[count]=array2[i];
			count++;
		}
		System.out.print("Merged Array: [ ");
		for(int i=0;i<arrayMerge.length;i++)
		{
			System.out.print(arrayMerge[i]+" ");
		}
		System.out.print(" ]");
	}

}

package Capg_Day4;


//Array can have anytype
//int,float, boolean ,double, Userdefined class
//Array will start from the zero

//Store the value in array
//print the value in array


//find the maximum of three number
//find the three of three number
//Sum of three number
//Avg of three number
//Percentage of marks

//


//Insert 
//print
//Duplicate value in array
//delete a element in array
//find the value in array
//sort the array element
//find the max number from array element 
//find the min number from array element
//sum of all the element of array
//Avg of all the element of array

import java.util.Scanner;

class Employees
{
	
}

public class MyArray {
	
	public static void main(String args[])
	{
  
		//Problem ..need to store 100 integer value
		int a;

		
		//more data to store u can make use of array
		
		//Array is datatype in java which allow store and print the one than more same type of data
		
		//data type        //name  array bracket        data type   size
		int[] arr= new int[5];
		String arr1[]= new String[5];
		float f[]= new float[5];
		double d[]=new double[5];
		/*
		 * //manually arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;
		 * 
		 * //printed as manually System.out.println("1 location "+arr[0]);
		 * System.out.println("2 location "+arr[1]);
		 * System.out.println("3 location "+arr[2]);
		 * System.out.println("4 location "+arr[3]);
		 * System.out.println("5 location "+arr[4]);
		 */
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Value for location "+i);
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
		 System.out.println("value at localtion "+arr[i]);	
		}
		
		
	}

}

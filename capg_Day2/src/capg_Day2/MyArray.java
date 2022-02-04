package capg_Day2;

import java.util.Scanner;
public class MyArray {

	
	//create a class with all type of array 
	
	//int
	//String
	//float
	//boolean
	//Double
	//Long
	
	
	public static void main(String args[])
	{
	//when you create array with new all the int value will default value as zero
     String a[]=new String[100];		 
     int [] b=new int[5];
     
     //write //setting a value
     //array starts with zero
		/*
		 * a[0]=10; a[1]=2; a[2]=45; a[3]=6; a[4]=2;
		 */
    // a[5]=9;
     Scanner sc=new Scanner(System.in);
     
     for(int i=0;i<5;i++)
     {
    	 System.out.println("Enter Value for "+i);
    	 a[i]=sc.next();
    	 //i=0
    		//	 a[0]=22;
    	 //i=1;
    	       //a[1]=2;
     }
     
     for(int i=0;i<5;i++)
     {
    	 System.out.println(a[i]);
     }
     
     //Read//printing 
 /*    System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
     System.out.println(a[3]);
     System.out.println(a[4]);
     */
    // ArrayIndexOutOfBoundsExeption
     //System.out.println(a[5]);
     
     
     
     
     
     
	}
}

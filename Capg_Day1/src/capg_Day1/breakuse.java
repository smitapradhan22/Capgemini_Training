package capg_Day1;

import java.util.Scanner;

public class breakuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter to stop loop from(1 to 100): ");
	int num=sc.nextInt();
			    for(int i=1;i<=100;i++){  
			        if(i==num){  
			            break;  
			        }  
			        System.out.println(i);  
			    }  
			}  
			
	}



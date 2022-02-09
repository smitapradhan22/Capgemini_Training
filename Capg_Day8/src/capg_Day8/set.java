package capg_Day8;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class student1
{
	private int roll_no;
	private String fname;
	private String lname;
	private String school;
	
	public student1(int roll_no, String fname, String lname, String school) {
		super();
		this.roll_no = roll_no;
		this.fname = fname;
		this.lname = lname;
		this.school = school;
	}
	public student1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", fname=" + fname + ", lname=" + lname + ", school=" + school + "]";
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
public class set {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<student1> s=new ArrayList<student1>();
		while (true) {
			System.out.println("Enter 1 for insert");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for update");
			System.out.println("Enter 4 for sort ase");
			System.out.println("Enter 5 Sort desc");
			System.out.println("enter 6 for print the size");
			System.out.println("Enter 7 for exit");
			int choice = sc.nextInt();
			if(choice == 1) {				
				System.out.println("Enter the Number of Students you want to enter");
				int size = sc.nextInt();
				for(int i=0;i<size;i++)
				{
					
				
					System.out.println("Enter Roll No: ");
					int roll= sc.nextInt();
					System.out.println("Enter First Name: ");
					String fname = sc.next();
					System.out.println("Enter Last Name: ");
					String lname = sc.next();
					System.out.println("Enter School Name: ");
					String school = sc.next();
					s.add(new student1(roll,fname,lname,school));
					
				}
				 Iterator<student1> it = s.iterator();
				 
			        while (it.hasNext())
			        {
			            student1 student1 = (student1) it.next();
			 
			            System.out.println(student1);
			        }
			}
			else if(choice==2)
			{
				boolean found=false;
				System.out.println("enter roll no to delete :");
				int rollno=sc.nextInt();
				Iterator<student1> i=s.iterator();
				while(i.hasNext())
				{
					student1 s1=i.next();
					if(s1.getRoll_no()==rollno)					
					{
						i.remove();
						found=true;						
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				else
				{
					System.out.println("Record is deleted successfully");
				}
				
			}
			else if(choice==3)
			{
				boolean found=false;
				System.out.println("enter roll no to update :");
				int rollno=sc.nextInt();
				ListIterator<student1> li=s.listIterator();
				while(li.hasNext())
				{
					student1 s1=li.next();
					if(s1.getRoll_no()==rollno)					
					{
						System.out.println("enter new  first name : ");
						String firstname=sc.nextLine();
						
						System.out.println("enter new last name : ");
						String lastname=sc.nextLine();
						
						System.out.println("enter new school name : ");
						String sname=sc.nextLine();
						
						li.set(new student1(rollno,firstname, lastname,sname));
						
						found=true;						
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				else
				{
					System.out.println("Record is updated successfully");
					Iterator<student1> it = s.iterator();
					 
			        while (it.hasNext())
			        {
			            student1 student1 = (student1) it.next();
			 
			            System.out.println(student1);
			        }
				}
				
			}
			else if(choice==4)
			{
				//Collections.sort(s);
				
			}
			else if(choice==5)
			{
				
			}
			else if(choice==6)
			{
				System.out.println("Size = "+s.size());
			}
			else if(choice==7)
			{
				System.out.println("Exit");
				break;
			}
			else
			{
				System.out.println("Enter number between 1 to 7 :");
			}
		}
		
	}
}

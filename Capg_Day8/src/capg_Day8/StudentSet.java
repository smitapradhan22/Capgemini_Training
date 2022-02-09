package capg_Day8;
import java.util.*;

//Create Set with Integer element
//Create A Student class with(5 attribute)
//Create A set with Student

//Add the option
//Press 1 for insert
//Press 2 for delete
//Press 3 for Update
//Press 4 for sort ASC
//Press 5 for sort DESC
//Press 6 for print the size
//Press 7 for Exit

class Student
{
	
	public Student(int roll_No, String name, int std, String school, String city) {
	
		this.Roll_No = roll_No;
		this.Name = name;
		this.std = std;
		this.school = school;
		this.city = city;
	}
	private int Roll_No;
	private String Name;
	private int std;
	private String school;
	private String city;
	
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getSchool() {
		return school;
	}
	public void SetSchool(String school) {
		this.school = school;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [Roll_No=" + Roll_No + ", Name=" + Name + ", std=" + std + ", school=" + school + ", city="
				+ city + "]";
	}
	
}

public class StudentSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student obj=new Student();
		
		Set<Student> s = new HashSet<Student>();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
		System.out.println("Press 1 to add:");
		System.out.println("Press 2 to delete:");
		System.out.println("Press 3 to update:");
		System.out.println("Press 4 to sort asc:");
		System.out.println("Press 5 to sort desc:");
		System.out.println("Press 6 to print size:");
		System.out.println("Press 7 to Exit:");
		System.out.println("enter your choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Number of Students you want to insert:");
			int num=sc.nextInt();
			for(int i=0;i<num;i++) {
			 System.out.println("Enter Roll_No:");
			 int rollno=sc.nextInt(); 
			 System.out.println("Enter Student Name:");
			 String name=sc.next(); 
			 System.out.println("Enter Student Std:");
			 int standard=sc.nextInt();
			 System.out.println("Enter School name:");
			 String school=sc.next(); 
			 System.out.println("Enter City:");
			 String City=sc.next(); 
			
			 s.add(new Student(rollno,name,standard,school,City));
			}
			System.out.println("Following record has been added successfully:");
			for(Student standard1:s) {
				System.out.println(standard1.toString());	
			}
			break;
		case 2:
		{
			boolean found=false;
			System.out.println("enter roll no to delete :");
			int rollno=sc.nextInt();
			Iterator<Student> i=s.iterator();
			while(i.hasNext())
			{
				Student s1=i.next();
				if(s1.getRoll_No()==rollno)					
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
		}
			
		}
	}
}


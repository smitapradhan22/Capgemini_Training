package capg_Day2;
class Student1
{
	private int rollno;
	private String name;
	private String schoolName;
	//static class/nested static class
	static class Address
	{
		int houseno;
		String streetName;
		
		public void print()
		{
			System.out.println("nested class");
		}
	}
	static {
		System.out.println("Static block");
	}
	public Student1(int rollno, String name, String schoolName) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 std=new Student1(1,"smita","ktms");
		System.out.println(std);
		Student1.Address address=new Student1.Address();
		address.print();
		

	}

}

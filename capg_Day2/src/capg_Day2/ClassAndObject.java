package capg_Day2;

 class Stud {
	private int sId;
	private String sName;
	private int sClass;

	Stud() {
	}

	public Stud(int sId, String sname, int sclass) {
		super();
		this.sId = sId;
		sName = sname;
		sClass = sclass;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sName;
	}

	public void setSname(String sname) {
		sName = sname;
	}

	public int getSclass() {
		return sClass;
	}

	public void setSclass(int sclass) {
		sClass = sclass;
	}

	public void print() {
		System.out.println("Id: " + sId);
		System.out.println("Name: " + sName);
		System.out.println("Class: " + sClass);
	}
}

class Computer{
	private String brandName;
	static String processor;
	
	Computer(){}
	Computer(String brand){
		brandName = brand;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brand) {
		brandName = brand;
	}
	
	public static void Processor() {
		System.out.println("------------------------------------------------------");
		System.out.println("Processor Is: " + processor);
	}
	public void print() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Processor: " + processor);
	}
}

class Employee {
	private int eId;
	private String eName;
	private String eDepartment;
	Employee(){}
	public Employee(int eId, String eName, String eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDepartment = eDepartment;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	
	public String toString() {
		return "Employee [Employee Id: " +eId+ ", Employee Name: " +eName+ ", Employee Department: " +eDepartment+ "]";
	}
}

class Address {

}

class Product {

}

public class ClassAndObject {
	public static void main(String[] args) {
		Stud s1 = new Stud(101, "abc", 10);
		Stud s2 = new Stud(102, "xyz", 10);
		Stud s3 = new Stud(103, "pqr", 10);
		s1.print();
		s2.print();
		s3.print();
		
		System.out.println("------------------------------------------------------");
		Computer.processor = "Intel";
		Computer c1 = new Computer("HP");
		Computer c2 = new Computer("Dell");
		Computer c3 = new Computer("Asus");
		c1.print();
		c2.print();
		c3.print();
		Computer.Processor();
		
		Employee e1 = new Employee(101, "ABC", "Sales");
		Employee e2 = new Employee(102, "XYZ", "Testing");
		Employee e3 = new Employee(103, "MNO", "Development");
		System.out.println("------------------------------------------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("------------------------------------------------------");
	}
}
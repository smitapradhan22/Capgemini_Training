package capg_Day7;

class data{
	private int id;
	private String name;
	private String address;
	private int mobile_no;
	public data(int id, String name, String address, int mobile_no) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile_no = mobile_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
	public void display() {
		System.out.println("ID: "+ this.id);
		System.out.println("Name: "+ this.name);
		System.out.println("Address: "+this.address);
		System.out.println("Mobile No: "+this.mobile_no);
	}
}

public class classExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		data obj1=new data(1,"smita","Aurangabad",992233445);
		obj1.display();
		data obj2=new data(2,"Amruta","Aurangabad",99003445);
		obj2.display();
		data obj3=new data(3,"Priya","Jalna",982993445);
		obj3.display();
		data obj4=new data(4,"Shweta","Aurangabad",882233445);
		obj4.display();
	}

}

package capg_Day2;

class phone{
	String name;
	public phone(String name) {
		this.name=name;	
	}
	public void display() {
		System.out.println(name);
	}	
}

class laptop{
	String name;
	public laptop(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
	
}
class headphone{
	String name;
	public headphone(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
	
}
class tv{
	String name;
	public tv(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
	
}
class PC{
	String name;
	public PC(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mobile Names:");
		phone p1=new phone("Oppo");
		p1.display();
		phone p2=new phone("Vivo");
		p2.display();
		phone p3=new phone("Samsung");
		p3.display();
		System.out.println("Laptop Names:");
		laptop l1=new laptop("DELL");
		l1.display();
		laptop l2=new laptop("Lenovo");
		l2.display();
		laptop l3=new laptop("ASUS");
		l3.display();
		System.out.println("Headphone Names:");
		headphone h1=new headphone("boAt");
		h1.display();
		headphone h2=new headphone("Philips");
		h2.display();
		headphone h3=new headphone("Sony");
		h3.display();
		System.out.println("TV Names:");
		tv t1=new tv("LG");
		t1.display();
		tv t2=new tv("Samsung");
		t2.display();
		tv t3=new tv("Xiaomi");
		t3.display();
		System.out.println("PC Names:");
		PC pc1=new PC("LG");
		pc1.display();
		PC pc2=new PC("Dell");
		pc2.display();
		PC pc3=new PC("HP");
		pc3.display();
	}

}

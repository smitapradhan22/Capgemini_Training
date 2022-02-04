package capg_Day7;
//t,v,z will contain the data type

class person<T,V,Z>
{
 private T name;
 private V id;
 private Z salary;
 
 public person(String string, float f, double d) {
	// TODO Auto-generated constructor stub
}


public void Person(T name,V id,Z salary)
 {
	 this.name=name;
	 this.id=id;
	 this.salary=salary;
 }


public void show() {
	System.out.println(name);
	System.out.println(id);
	System.out.println(salary);
	
}
}
public class GenericClass {
	person p=new person("Smita",10f,1.0);
	//p.show();
	
}

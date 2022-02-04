package capg_Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//arraylist internally uses array as a data structure

//collection in java
//collection is set of different implementations
//like array, stack,linked list,Queue
//you are store data in collection and then you can manipulate data in collection

//collection is interface its parent class is iterable(interface)
//it is mainly divided to three parts i.e. list, queue and set.
public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if you do not assign value to list initially it is 10
		//you can change default size
		//creating object of arraylist
		ArrayList<String> list=new ArrayList();
		//add method is used to add the data
		list.add("smita");
		list.add("java");
		list.add("pradhan");
		list.add("capg");
		
		//delete all the elements in the list
		//list.clear();
		
		// search for given value if it is there return true
		//returns true or false
		//System.out.println(list.contains("java1"));
		
		//return value using index
		System.out.println("Found"+list.get(0));
		//print the value
		//java 1.8 feature
		//lambda expression
		list.forEach(System.out::println);
		//list.forEach(e->System.out.p);
		//index value
		//if present it returns value and if not present then it returns -1
		System.out.println(list.indexOf("java1"));
		
		//isEmpty
		//it will return true if list is empty
		//it returns false if list is present
		System.out.println(list.isEmpty());
		
		//iterator
		//print or modify all the value
		Iterator<String> it=list.iterator();
		//hasNext()
		//return true if there is next value
		while(it.hasNext()) {
			System.out.println("Iterator: "+it.next());
		}
		
		//size()
		
		//sort()
		//asc or desc
		Collections.sort(list);
		Collections.sort(list,Collections.reverseOrder());
		//remove
		//you can remove by index value
		System.out.println("removed: "+list.remove(0));
		//directly with to string
		System.out.println(list);
		for(Object obj:list)
		{
			System.out.println(" "+obj.toString());
		}
	}
	

}

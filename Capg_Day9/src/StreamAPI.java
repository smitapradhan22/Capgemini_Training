import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 //Stream is a class in java
 
public class StreamAPI {
	public static void main(String args[]) {
	List<Integer> ls = new ArrayList<Integer>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	ls.add(-70);
	ls.add(-90);
	
	Stream<Integer> s = ls.stream();
	ls.stream().forEach(System.err::println);  //again using stream
	System.out.println("-----------------------------------------------------------");
	ls.stream().forEach(System.out::println);
	System.out.println("-----------------------------------------------------------");
	ls.stream().forEach(str ->System.out.println(str));
	
	System.out.println("-----------------------------------------------------------");
	//filter
	//returns ture if data needs to be considered
	//returns false if data not to be considered
	ls.stream().filter(num ->num >= 20).forEach(System.out::println);
	System.out.println("-----------------------------------------------------------");
	
	//Collection the data and return back
			//filters the data of only positive num
			//collectors method is used to send it back
			//collect method will collect all the data and return as list
			//Collectors.toList() convers the data to list
	List<Integer> filterList = ls.stream()
	.filter(num->num>10).collect(Collectors.toList());
	filterList.forEach(System.out::println);
	System.out.println("-----------------------------------------------------------");
	
	//you can modify the data and return it
	ls.stream().map(data->data*2).forEach(System.out::println);
	System.out.println("-----------------------------------------------------------");
	ls.stream().map(data->data>0).forEach(System.err::println); //err is used to print output in red color
	System.out.println("-----------------------------------------------------------");
	List<Integer> filterList1 = ls.stream().map(data->data/3).collect(Collectors.toList());
	filterList1.forEach(System.out::println);
}

}
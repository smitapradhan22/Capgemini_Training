package capg_Day5;

public class ReverseString {
	public static void main(String[] args) {

		  String str = "Hello world";
		  String revString = "";
		  
		  System.out.println(str);

		  for (int i = str.length() - 1; i >= 0; --i) {
		   revString += str.charAt(i);
		  }

		  System.out.println(revString);
		 }

}


interface StringArray1{
	public void print();
}

public class StringArrayUsingLambda {
	public static void main(String[] args) {
		StringArray1 string =() ->{
			String[] str = {"abc", "pqr", "xyz", "efg"};
			for(int i=0; i<str.length;i++) {
				System.out.println(str[i]);
			}
		};
		string.print();
	}
}
package capg_Day5;



public class StringBufferAndBulider {
	
		public static void main(String arg[]) {
			String str = "Hello";
			// new string value
			// str="Hello Java";
			str = str.concat(" Java");
			System.out.println(str);
			// cannot used as data type
			// StringBuffer used with new keyword
			// Not Thread safe(any number of thread can use this method)
			StringBuffer sbf = new StringBuffer("Hello");
			sbf.append(" java");
			System.out.println(sbf);
	        //delete in string
			sbf.delete(2, 5);
			System.out.println(sbf);
			
			//sbf.
			//Only One Thread can use this at a time
			StringBuilder sb=new StringBuilder("Hello Java");
	         System.out.println(sb);
	         sb.append(" Hello");
	        //
	         System.out.println(sb);
		}

}

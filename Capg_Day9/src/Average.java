
		import java.util.Arrays;
import java.util.OptionalDouble;
		import java.util.stream.IntStream;

		/**
		 * To calculate average of numbers using Array in Java 8
		 * 
		 * @author D.V
		 *
		 */
		public class Average {

		    public static void main(String[] args) {

		        int[] arr = new int[10];

		        arr[0] = 20;
		        arr[1] = 50;
		        arr[2] = 99;
		        arr[3] = 12;
		        arr[4] = 94;
		        arr[5] = 22;
		        arr[6] = 43;
		        arr[7] = 56;
		        arr[8] = 55;
		        arr[9] = 78;

		        IntStream streamOfNumbers = Arrays.stream(arr);

		        OptionalDouble averageOfNumbers = streamOfNumbers.average();

		        System.out.println("Average of Numbers: " + averageOfNumbers);

		    }


		}

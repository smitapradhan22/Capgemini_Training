
interface series{
	public void numberSeries();
}
public class Lambda1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		series s=()->{
			for(int i=0;i<=100;i++) {
				System.out.print(i+" ");
			}
		};
		s.numberSeries();
	}

}

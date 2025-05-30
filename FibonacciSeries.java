package week1.assignement;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int j=0;
		int k=1;
		System.out.println("Fibonacci Series for Range: "+range);
		for(int i=1;i<=range;i++)
		{
			System.out.println(j);
			int l=j+k;
			j=k;
			k=l;
					
		}

	}

}

public class SumOverload { 
	
	static int sum(int a,int b) {
		return a+b;
	}
	
	static int sum(int x,int y,int z) {
		return x+y+z;
	}
	
	static double sum(double c,double d) {
		return c+d;
	}
	static long sum(long m,long n,long o,long p) {
		return m+n+o+p;
	}

	public static void main(String[] args) {
		int sum1=sum(1, 2);
		int sum2=sum(2, 4, 6);
		double sum3=sum(10.25, 20.24);
		double sum4= sum(100.20, 200.02);
		long sum5=sum(100, 200, 300, 150);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		
		System.out.println(sum(60, 5));
	}

}

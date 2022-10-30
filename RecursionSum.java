public class RecursionSum { 
	 
	static int sum(int a) {
		if (a>0) {
			return a+sum(a-1);
			
		} else {
			return 0;

		}
	}

	public static void main(String[] args) {
		int result1=sum(5);
		int result2=sum(6);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(sum(10));
		}

}

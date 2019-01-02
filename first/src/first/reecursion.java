package first;

public class reecursion {
	static int fact =1;
	public static int factorial(int n)
	{
		if(n!=0)
		{
			fact = fact*n;
			n--;
			factorial(fact);
		}
		return n;
		
	}
	public static void main(String[] args) {
		
		int dd = factorial(5);
		System.out.println(dd);
	}

}

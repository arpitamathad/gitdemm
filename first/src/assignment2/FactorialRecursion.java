package assignment2;

import java.util.Scanner;

public class FactorialRecursion {
	
	public int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		FactorialRecursion fr = new FactorialRecursion();
		int a = fr.fact(n);
		System.out.println(a);

	}

}

package assignment2;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nextInt = scan.nextInt();
		boolean flag =false;
		for(int i=2;i<nextInt/2;i++)
		{
			if(nextInt%i == 0)
			{
				flag =true;
				break;
			}
		}if(flag == false)
			System.out.println("Number is not prime");
		else 
			System.out.println("number is Prime");

	}

}

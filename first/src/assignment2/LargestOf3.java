package assignment2;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a= scan.nextInt();
	    int b= scan.nextInt();
	    int c= scan.nextInt();
	    if(a>b && a>c)
	    	System.out.println("Largeast number is a "+a);
	    else if(b>c && b>a)
	    	System.out.println("Largest number is b "+b);
	    else
	    	System.out.println("Largest number is c "+c);
	}

}

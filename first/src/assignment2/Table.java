package assignment2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    System.out.println("Enter any number");
    for(int i=1;i<=10;i++)
    {
    	System.out.println(n+" X "+i+" = "+n*i);
    }

	}

}

package assignment2;

import java.util.Scanner;

public class Tablefrom1TO10 {

	public static void main(String[] args) {
		
//		    int n= 1;
//		   while(n<=10)
//		   {
//			   for(int i=1;i<=10;i++)
//			    {
//			    	System.out.println(n+" X "+i+" = "+n*i);
//			    } 
//			   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");n++;
//		   }
//	
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int n=i*j;
				System.out.print("  "+i+" X "+j+" = "+n+"   ");
			}System.out.println();
		}

	}

}

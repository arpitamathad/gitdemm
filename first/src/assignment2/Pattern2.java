package assignment2;

public class Pattern2 {

	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=4;i++)
		{int p=1;
			for(int k=4;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=count*2+1;j++)
			{
				if(j<i)
				    System.out.print(p++);
				else if(i==j)
					System.out.print(p);
				else
					System.out.print(--p);
			}System.out.println();count++;
		}

	}

	}



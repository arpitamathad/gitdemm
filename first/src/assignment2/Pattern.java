package assignment2;

public class Pattern {

	public static void main(String[] args) {
		int count =0,a=1;
//		for(int i=1;i<=4;i++)
//		{
//			for(int k=4;k>i;k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=count*2+1;j++)
//			{
//				System.out.print(i);
//			}System.out.println();count++;
//		}
		
		for(int i=4;i>=1;i--)
			{
				for(int j=1;j<=4+count;j++)
				{
					if(j<i)
					   System.out.print(" ");
					else
						System.out.print(a);
				}System.out.println();count++;a++;
			}
			

	}

}

import java.util.Scanner;

public class Prime_print
{
	public static void main(String arg[])
	{
		int i,j;
		
		
		System.out.println("Prime numbers between 1 and 100 \n");
		for(i=1;i<=100;i++)
		{
			
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
			
			
			if(j==i)
			{
				System.out.print(i+" ");
			}
			
			
		}
		
		
	}

}

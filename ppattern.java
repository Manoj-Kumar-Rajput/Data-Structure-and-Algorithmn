package javaintermediate;

import java.util.Scanner;

public class ppattern 
{
	public static void main(String man[])
	
	{
		Scanner s=new Scanner(System.in);								//simple left pattern program
		System.out.print("enter the number\t");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
			{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println("");
			}
			
				
		
		
		    for(int i=1;i<=n;i++) 									//star right pattern program
		    {
		    	for(int j=i;j<=n-1;j++)
		    	{
					
					System.out.print(" ");
					}

				for(int k=1;k<=i;k++)
				{
				System.out.print("*");
				}
		      System.out.println("");
		    }
		
		
		for(int i=1;i<=n;i++)											//number left pattern program
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i);
			}System.out.println("");
		}	
		
		for(int i=1;i<=n;i++)
		{																//star triangle print pattern		
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}System.out.println("");
		}
		
		
		for(int i=1;i<=n;i++) 							//Star hollow triangle print
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
			}System.out.print("*");
			for(int k=2;k<=i*2-1;k++)
			{   if(i==n) 
				{
					for(int m=1;m<i*2-1;m++)
					{
						System.out.print("*");
						
					}break;
				}	
				
				else if(k==i*2-1)
				{
					System.out.print("*");
				}System.out.print(" ");
						
			}System.out.println("");
				
			
		}
		
		
		for(int i=1;i<=n;i++) 									// print hollow square 
		{
			for(int j=1;j<=n;j++)
			{   if(i==1 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					if(j==1 ||j==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}System.out.println("");
			
		}
		
		
		for(int i=1;i<=n;i++) 								//print I pattern with new Design
		{
			for(int j=1;j<=n;j++)			
			{   if(i==1 || i==n)
				{
					System.out.print("*");
				}
				else
				{
					for(j=1;j<=n;j++)
					{
					    if(j==1||j==n)
						System.out.print(" ");
					
						else
					
						System.out.print("*");
					}
				}
			}System.out.println("");
		}
	}
}

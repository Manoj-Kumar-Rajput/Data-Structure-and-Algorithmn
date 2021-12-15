package javaintermediate;

import java.util.Scanner;
public class ppattern2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:\t");
		int n=s.nextInt();
		System.out.print("enter the character:\t");
		String str=s.next();
		//pattern(n,str);
		//pattern2(n);
	}
	
	
	/*public static void pattern(int n,String str)
	{   int l=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str);													//print
			}																			//	*      *				
			for(int k=1;k<=(l*str.length()*2);k++)										//	**    **
			{																			//	***  ***
				System.out.print(" ");													//	********
			}l--;																		//	***  ***	
			for(int g=1;g<=i;g++)														//	**    **
			{																			//	*	   *
				System.out.print(str);
				
			}System.out.println("");
		}
		int b=1;
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str);
			}
			for(int k=1;k<=2*str.length()*b;k++)
			{
				if(b<=n)
				{
					System.out.print(" ");
				}
			}b++;
			for(int x=1;x<=i;x++)
			{
				System.out.print(str);
			}System.out.println("");
		}
		
	}
	
	
	public static void pattern2(int n)
	{	Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=i;j++)
			{	
				if(i==1||i==n)
				{
					for(int k=1;k<=n;k++)
					{
						System.out.print(y);
					}
				}
				else
				{
					for(int k=1;k<=n;k++)
					{
						if(k==1||k==n)
						{
							System.out.print(y);
						}
						else
						{
							if(i==2 ||i==n-1 ||k==2||k==n-1)
							{
								System.out.print(y-1);
							}
							else
							{	
								if(i==3||i==n-2||k==3||k==n-2)
								{
									System.out.print(y-2);
								}
								else
								{
									System.out.print(y-3);
								}
							}
						}
					}
				}
			}System.out.println("");
			

		}
					
	}*/	
}

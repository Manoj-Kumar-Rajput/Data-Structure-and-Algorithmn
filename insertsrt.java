package sorting;

import java.util.Scanner;
public class insertsrt 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elemnt");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		arr=insertsort(arr);
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	static int[] insertsort(int[] arr)
	{		for(int i=0;i<arr.length-1;i++)
			{
				int j=i+1;
				int temp=0;
				while(j>0)
				{
				if(arr[j]<arr[j-1])
				{	
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;		
				}
				j=j-1;
				}
			}
		return arr;
	}
}

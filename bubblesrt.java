package sorting;

import java.util.Scanner;

public class bubblesrt {
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		System.out.println("Enter the Array Element :");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		bubblesort(arr);
	}
	
	static void display(int[] a)
	{
		System.out.println("Sorted array elemnets :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	///////////Bubble Sort
	static void bubblesort(int[] a)
	{
		int flag;
		int temp;
		for(int i=0;i<a.length;i++)
		{	
			flag=0;
			for(int j=0;j<(a.length-1)-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) break;
		}
		display(a);
	}
	

}

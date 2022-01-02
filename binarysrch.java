package searching;

import java.util.Scanner;
public class binarysrch 
{
	public static void main(String[] args)
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=s.nextInt();
	System.out.println("enter the elemnet of array");
	int[] arr=new int[n];
		for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
		int lower=0;
		int higher=arr.length-1;
		

	System.out.println("enter the element value which you want to search the index");
	int item=s.nextInt();
	int temp=0;
	while(lower<=higher)
	{	int mid=(lower+higher)/2;
		if(arr[mid]==item)
		{	
			temp=1;
			System.out.println("Index of element is "+ (++mid));
			break;
		}
		else if(arr[mid]<item)
		{
			lower=mid+1;
		}
		else
		{
			higher=mid-1;
		}
	}
	if(temp==0)
	{
		System.out.println("item is not found");
	}
	
	}

}

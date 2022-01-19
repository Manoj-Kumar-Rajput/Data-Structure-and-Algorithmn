package sorting;
import java.util.Scanner;
public class countersorting 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		if(n>0)
		{
			System.out.println("Enter the elements of array");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			
			//find max element in arr which is donate key value or index value k
			
			int key=max(arr,arr.length);
			
			//sort the array according to index or key value without comparison
			
			countingsort(arr,arr.length,key);
			System.out.println("Sorted array through Counting Sort");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println("");
		}
		
		else System.out.println("Empty list");
		
		}
			
		
	
	///finding max elements of counting sort
	static int max(int[] a,int size)
	{
		if(size==0) 
		{
			System.out.println("Empty list");
			return 0;
		}
		
		else
		{
			int i=0;
			int key=a[i];
			for(i=0;i<size;i++)
			{
				if(key<a[i])
				{
					key=a[i];
				}
			}
			return key;
		}
		
		
	}
	
	///sort te elements through counting sort algorithmn
	static void countingsort(int[] a,int size,int key)
	{
		int[] count =new int[key+1];
		int[] b=new int[size];
		for(int i=0;i<size;i++)
		{
			++count[a[i]];
		}
		for(int i=1;i<=key;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=size-1;i>=0;i--)
		{
			b[--count[a[i]]]=a[i];
		}
		for(int i=0;i<size;i++)
		{
			a[i]=b[i];
		}
	
		
	}
}

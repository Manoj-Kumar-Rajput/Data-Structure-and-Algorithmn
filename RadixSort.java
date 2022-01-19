package sorting;
import java.util.Scanner;
public class RadixSort {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n=s.nextInt();
		int[] arr=new int[n];
		if(n>0)
		{
			System.out.println("Enter the Array elements");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			
			int max=max(arr,arr.length);
			System.out.println("Hii manoj");
		
			for(int i=1;max/i>0;i=i+9)
			{
				radixsort(arr,arr.length,i);
			}
			
			/// printing sorted array 
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+"\t");
			}
		}
		else System.out.println("Empty list");
		
		}
		
	static int max(int[] arr,int size)
	{
		int i=0;
		int maxvalue=arr[i];
		while(i<size)
		{
			if(maxvalue<arr[i])
			{
				maxvalue=arr[i];
			}
			i++;
		}
		
		return maxvalue;
	}
	static void radixsort(int[] arr,int size,int pos)
	{
		int key=10;
		int[] radix=new int[key];
		int[] b=new int[size];
		for(int i=0;i<size;i++)
		{
			++radix[(arr[i]/pos)%10];
		}
		for(int i=1;i<key;i++)
		{
			radix[i]+=radix[i-1];
		}
		
		//initialize value through key value
		for(int i=size-1;i>=0;i--)
		{
			b[--radix[(arr[i]/pos)%10]]=arr[i];
		}
		
		///for shifting "b" array elements into our main Array
		for(int i=0;i<size;i++)
		{
			arr[i]=b[i];
		}
	}

}

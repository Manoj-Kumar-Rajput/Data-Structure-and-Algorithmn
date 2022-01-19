package sorting;
import java.util.Scanner;
public class MergeSort {
	
	static void merge(int[] a,int start,int end,int mid)
	{
		int len1=(mid-start)+1;
		int len2=end-mid;
		
		int[] arr1=new int[len1];
		int[] arr2=new int[len2];
		int mainindex=start;
		for(int i=0;i<len1;i++)
		{
			arr1[i]=a[mainindex++];
		}
		mainindex=mid+1;
		for(int j=0;j<len2;j++)
		{
			arr2[j]=a[mainindex++];
		}
		
		int mainindex1=start;
		int i=0;
		int j=0;
		
		while(i<len1 && j<len2)
		{
			if(arr1[i]<arr2[j])
			{
				a[mainindex1++]=arr1[i++];
			}
			
			else
			{
				a[mainindex1++]=arr2[j++];
			}
		}
		while(i<len1)
		{
			a[mainindex1++]=arr1[i++];
		}
		while(j<len2)
		{
			a[mainindex1++]=arr2[j++];
		}
				
}
	static void mergesort(int[] a,int start,int end)
	{
		if(start>=end) return ;
		
		int mid=(start+end)/2;
		mergesort(a,start,mid);
		
		mergesort(a,mid+1,end);
		
		merge(a,start,end,mid);
	}
		


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a= new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		mergesort(a,0,n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	
}

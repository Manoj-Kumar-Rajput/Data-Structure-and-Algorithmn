package sorting;
import java.util.Scanner;


public class QuickSort {
	
	static int sort(int[] a,int start,int end,int pivot)
	{
		
		int pivot2=start;
		int count =0;
		int flag=0;
		for(int i=1;i<=end;i++)
		{
			if(a[i]<=pivot)
			{
				count++;
				flag=1;
			}
		}
		if(flag==1)
		{
		int temp=a[count];
		a[count]=pivot;
		a[pivot2]=temp;
		
		int i=start;
		int j=end;
		while(i<count && j>count)
		{
			while(a[i]<pivot)
			{
				i++;
			}
			while(a[j]>pivot)
			{
				j--;
			}
		
			if(i<count && j>pivot)
			{
				temp=a[i];
				a[i++]=a[j];
				a[j--]=temp;
			}
				
		}
		
		return count;
		}
		else 
			return count;
	}
	
	static void quickSort(int[] a,int start,int end)
	{
		if(start>=end) return;
		
		int pivot=a[start];
		
		int mid=sort(a,start,end,pivot);
		
		quickSort(a,start,mid-1);
		
		quickSort(a,mid+1,end);
		
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Array size");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the Elements of Array");
		
		for(int i=0;i<a.length;i++)			///for taking input array elements	
		{
			a[i]=sc.nextInt();
		}
		
		quickSort(a,0,n-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
			
	}
	
}	



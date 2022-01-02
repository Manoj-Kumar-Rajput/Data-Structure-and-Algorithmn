package sorting;
import java.util.Scanner;
public class selectionsrt 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		selectionsort(arr);
	}
	static void selectionsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp;
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
								
		}
		System.out.println("Sorted Array Elements :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}

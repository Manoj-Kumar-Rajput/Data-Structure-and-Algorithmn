package searching;
import java.util.Scanner;
public class linearsrch
{
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elemnet of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter the element value which you want to search the index");
		int item=s.nextInt();
		int temp=0;
		for(int i=0;i<n;i++)
		{	
			if(arr[i]==item)
			{
				temp=1;
				System.out.println("Item index is " +(++i));
				
			}
		}
		if(temp==0)
		{
			System.out.println("item is not found");
		}
		
	}
}

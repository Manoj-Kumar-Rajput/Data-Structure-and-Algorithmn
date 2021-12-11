import java.util.Scanner;
import java.lang.*;
class array{
	public static void main(String... args)
	{
		act ac=new act();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int[] a=new int[n] ;
		boolean b=true;
		int no=0;
		while(b)
		{ 	
			System.out.println("press 1: create the array");
			System.out.println("press 2: Display the array");
			System.out.println("press 3:delete the array at the beginning");
			System.out.println("press 4: Delete the array at he end position");
			System.out.println("press 5:Delete the array specific proition");
			System.out.println("press 6 :insertion the array at beg");
			System.out.println("press 7 :insertion the array at end");
			System.out.println("press 8 :insertion the array at specific position");
			System.out.println("Press any other key except this keys: For exit the program");
			System.out.println("Enetr yourr choice");
			int ch=s.nextInt();
			switch(ch)
			{
			
			case 1:
			{	
				if(n<=0)
				{
				System.out.println("your array size is zero. Please redefine the size");
				n=s.nextInt();
				a=new int[n] ;
				break;
				}
				System.out.println("enter the number of array element");
				no=s.nextInt();
				System.out.println("enter the array element");
				ac.create(no,a);
				break;
			
			}
			case 2:
			{
				if(no<=0)
				{
					System.out.println("your array list is empty");
					break;
				}
				else
				{
				System.out.println("your array list is:");
				ac.display(no,a);
				break;
				}
			}
			case 3:
			{
				no=ac.deletatbeg(no,a);
				break;
			}
			case 4:
			{
				no=ac.deleteatend(no,a);
				break;
			}
			case 5:
			{
				System.out.println("Enter the specific poition for delete the element");
				int pos=s.nextInt();
				no=ac.deletepos(no, pos, a);
				break;
			}
			case 6:
			{
				
				
				System.out.println("enter the element which you want inserted");
				int item=s.nextInt();
				no=ac.insertatbeg(no,item,a);
				break;
			}
			case 7:
			{	
				System.out.println("enter the element which you want inserted");
				int item=s.nextInt();
				no=ac.insertatend(no,item,a);
				break;
			}
			case 8:
			{
				
				System.out.println("enter the specific position for insertion");
				int pos=s.nextInt();
				System.out.println("enter the element which you want inserted");
				int item=s.nextInt();
				no=ac.insertatpos(no,pos,item,a);
				break;
			}
			default:
			{
				b=false;
			}
			
		}
		
	}
}
}
class act
{
	Scanner s=new Scanner(System.in);

	public void create(int no,int[]a)
	{
		
		for(int i=0;i<no;i++)
		{
			a[i]=s.nextInt();
		}
	}
	void display( int no,int[]a)
	{
		if(no<=0)
		{
			System.out.println("array element is empty");
	
		}
		else
		{
		for(int i=0;i<no;i++)
		{
			System.out.print(a[i]+"\t");
		}
		}
	}
	int deletatbeg(int no,int[]a)
	{
		for(int i=0;i<no-1;i++)
		{
		
			if (a.length<=0)
			{
				System.out.println("array is empty");
			}
			else
			{	
				
				a[i]=a[i+1];
			}
		}System.out.println(no<=0? "Please create array!": "delete is success");
		no--;
		return no;
			
	}
	int deleteatend(int no,int[]a)
	{
		if(a.length<=0)
		{
			System.out.println("array is empty");
		}
		else
		{
			System.out.println("delete success");
			no--;
		}
		return no;
	}
	int deletepos(int no,int pos,int[]a)
	{
		for(int i=pos-1;i<no-1;i++)
		{
			a[i]=a[i+1];
			
		}System.out.println(no<=0? "Please create array!": "delete is success");
		no--;
		return no;
	}
	int insertatbeg(int no,int item,int[]a)
	{  no=no+1;
		for(int i=no;i>0;i--)
		{	
			a[i]=a[i-1];
		}a[0]=item;
		System.out.println("Success");
		return no;
	}
	int insertatend(int no,int item,int[]a)
	{	no=no+1;
		for(int i=no;i<=no;i++)
		{
			a[i-1]=item;
		}
		System.out.println("Success");
		return no;
	}
	int insertatpos(int no,int pos,int item,int[]a)
	{	
		no=no+1;
		for(int i=no-1;i>=pos;i--)
		{
			a[i]=a[i-1];
			
		}
		a[pos-1]=item;
		System.out.println("Success");
		return no;
	}
}



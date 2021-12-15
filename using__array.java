package stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class using__array 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		List<Integer> stack=new  ArrayList();
		boolean b=true;
		int Top=-1;
		while(b)
		{
			System.out.println("Press1 for push");
			System.out.println("Press2 for pop");
			System.out.println("Press3 for Display");
			System.out.println("Press4 for exit");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data");
				int value=s.nextInt();
				Top++;
				stack.add(Top,value);
				break;
			case 2:
				if(Top==-1)
				{
					System.out.println("stack is empty");
				}
				else
				stack.remove(Top);
				Top--;
				break;
			case 3:
				System.out.println(stack);
				break;
			case 4:
				b=false;
				System.out.println("successfully exit");
				break;
			}
		}
	}
}

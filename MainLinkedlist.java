package linkedlist;
import java.util.Scanner;

public class MainLinkedlist 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		singly si=new singly();
		boolean b=true;
		while(b)
		{
			System.out.println("press 1.for create linkedlist");
			System.out.println("press 2.for display");
			System.out.println("press 3.for insert at beg");
			System.out.println("press 4.for insert at given position");
			System.out.println("press 5 for delete at beginning");
			System.out.println("press 6 for delete at end");
			System.out.println("press.7 for delete at specific pos");
			System.out.println("press.8 for exit");
			System.out.println("press.9 for size of array");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			int value;
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				si.setData(value);
				break;
			case 2:
				si.display();
				break;
			case 3:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				si.insertatbeg(value);
				break;
			case 4:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				System.out.println("Enter the position of node");
				int pos=s.nextInt();
				si.insertatpos(value, pos);
				break;
			case 5:
				si.deleteatbeg();
				break;
			case 6:
				si.deleteatend();
				break;
			case 7:
				System.out.println("Enter the position of node");
				pos=s.nextInt();
				si.deleteatpos(pos);
				break;
			case 8:
				System.out.println("/*************\tSuccessfully exit\t*************/");
				b=false;
				break;
			case 9:
				si.sizeoflist();
				break;
			default:
				System.out.println("Enter Wrong Input CAase");
				break;
			}
		}
		
	}
}


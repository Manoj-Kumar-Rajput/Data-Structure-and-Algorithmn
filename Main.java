package doublylinkedlist;
import java.util.Scanner;
public class Main 
{
	public static void main(String... args)
	{
		doubly d=new doubly();
		Scanner s=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("Press1. for display linked list");
			System.out.println("Press2. for create doubly linked list");
			System.out.println("Press3. for insert at beg");
			System.out.println("Press4. for insert At pos");
			System.out.println("Press5. for delete At beg");
			System.out.println("Press6. for delete At end");
			System.out.println("Press7. for delete At pos");
			System.out.println("Press8. for find size of the node");
			System.out.println("Press9. for exit");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			int value;;
			switch(ch)
			{
			case 1:
				d.display();
				break;
			case 2:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				d.create(value);
				break;
			case 3:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				d.insertatbeg(value);
				break;
			case 4:
				System.out.println("Enter the data of node");
				value=s.nextInt();
				System.out.println("Enter the position which you want insert the element");
				int pos=s.nextInt();
				d.insertatpos(value,pos);
				break;
			case 5:
				d.deleteatbeg();
				break;
			case 6:
				d.deleteatend();
				break;
			case 7:
				System.out.println("Enter the position which you want delete the element");
				pos=s.nextInt();
				d.deleteatpos(pos);
				break;
			case 8:
				d.size();
				break;
			case 9:
				System.out.println("/*************\tSuccessfully exit\t*************/");
				b=false;
				break;
			}
		}
		
	}
}

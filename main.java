package simplecircularlinkedlist;
import java.util.Scanner;
public class main
{
	public static void main(String[] args)
	{
		scircular sc=new scircular();
		Scanner s=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("Press1. for display");
			System.out.println("Press2. for create at end");
			System.out.println("press3. for insert at beg");
			System.out.println("press4. for insert at pos");
			System.out.println("Press5. for delete at end");
			System.out.println("press6. for delete at beg");
			System.out.println("press7. for delete at pos");
			System.out.println("Press8. for size of list ");
			System.out.println("press9. exit");
			int ch=s.nextInt();
			int value;
			int pos;
			switch(ch)
			{
			case 1:
				sc.display();
				break;
			case 2:
				System.out.println("Enter the value of New node");
				value=s.nextInt();
				sc.create(value);
				break;
			case 3:
				System.out.println("Enter the value of New node");
				value=s.nextInt();
				sc.insertatbeg(value);
				break;
			case 4:
				System.out.println("Enter the value of New node");
				value=s.nextInt();
				System.out.println("enter the position");
				pos=s.nextInt();
				sc.insertatpos(value, pos);
				break;
			case 6:
				sc.deleteatbeg();
				break;
			case 5:
				sc.deleteatend();
				break;
			case 7:
				System.out.println("enter the position");
				pos=s.nextInt();
				sc.deleteatpos(pos);
				break;
			case 8:
				sc.sizeoflist();
				break;
			case 9:
				System.out.println("/************ successfully exit **************/");
				b=false;
				break;
				default:
					System.out.println("wrong input");
					break;
			}
		}
	}

}

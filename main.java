package doublycircularlinkedlist;
import java.util.Scanner;
public class main 
{
	public static void main(String[] args)
	{
		dcircular dc=new dcircular();
		Scanner s=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("press1. for display");
			System.out.println("press2. for create");
			System.out.println("press3. for create at beginning");
			System.out.println("press4. for create at pos");
			System.out.println("press5. for delete at beg ");
			System.out.println("press6. for delete at end ");
			System.out.println("press7. for delete at pos");
			System.out.println("press8. for size of list");
			System.out.println("press9. for exit");
			System.out.println("Enter choice");
			int ch=s.nextInt();
			int value,pos;
			switch(ch)
			{
			case 1:
				dc.display();
				break;
			case 2:
				System.out.println("Enter value");
				value=s.nextInt();
				dc.create(value);
				break;
			case 3:
				System.out.println("Enter value");
				value=s.nextInt();
				dc.createatbeg(value);
				break;
			case 4:
				value=s.nextInt();
				pos=s.nextInt();
				dc.createatpos(pos,value);
				break;
			case 5:
				dc.deleteatbeg();
				break;
			case 6:
				dc.deleteatend();
				break;
			case 7:
				pos=s.nextInt();
				dc.deleteatpos(pos);
				break;
			case 8:
				dc.sizeoflist();
				break;
			case 9:
				b=false;
				break;
				
			}
		}
		
	}

}

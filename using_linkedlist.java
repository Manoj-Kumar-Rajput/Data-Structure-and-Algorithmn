package stack;
import java.util.Scanner;
public class using_linkedlist {
	Node Head;
	int top=-1;
	public static void main(String[] args)
	{
		using_linkedlist ll=new using_linkedlist();
		Scanner s=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("Press1 for push");
			System.out.println("Press2 for pop");
			System.out.println("Press3 for Display");
			System.out.println("Press4 for where is top point");
			System.out.println("Press5 for exit");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data");
				int value=s.nextInt();
				ll.push(value);
				break;
			case 2:
				ll.pop();
				break;
			case 3:
				ll.display();
				break;
			case 4:
				System.out.println("top point->->"+ll.top());
				break;
			case 5:
				b=false;
				System.out.println("succesfully exit");
				break;
			}
		}
	}
	class Node
	{
		private Node next;
		private int data;
	}
	void push(int value )
	{
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		top++;
		if(Head==null)
		{
			Head=temp;
		}
		else
		{
			Node cpy=Head;
			while(cpy.next!=null)
			{
				cpy=cpy.next;
			}
			cpy.next=temp;		
		}
		
	}
	void pop()
	{
		if(Head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			
			if(top==0)
			{
				Head=null;
				top--;
			}
			else
			{
			top--;
			Node temp=Head;
			Node last=Head;
			while(temp.next!=null)
			{
				last=temp;
				temp=temp.next;
			}
			last.next=null;
			}
		}
	}
    void display()
	{
    	if(Head==null)
    	{
    		System.out.println("List is empty");
    		
    	}
    	else
    	{
    	Node temp=Head;
    	while(temp.next!=null)
    	{
    		System.out.println(temp.data+"->->"+temp.next);
    		temp=temp.next;
    	}
		System.out.println(temp.data+"->->"+temp.next);
    	}
	}
    int top()
    {
    	if(top==-1)
    	{
    		System.out.println("stack is underflow");
    	}
    	return top;
    }
	

}

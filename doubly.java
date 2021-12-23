package doublylinkedlist;

public class doubly 
{
	private int size;
	private Node Head;
	
	class Node
		{
			private int data;
			private Node prev;
			private Node next;
		}	
	void create(int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		temp.prev=null;
		size++;
		if(Head==null)
		{
			Head=temp;
			temp.prev=null;
		}
		else
		{
			Node temp1=Head;
			while(temp1.next!=null)
			{
				
				temp1=temp1.next;
				temp1=temp1.prev;
			}
			Node cpy=temp1;
			temp1.next=temp;
			temp.prev=cpy.next;
			
		}
		
	}
	void display()
	{
		if(size==0)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=Head;
			while(temp.next!=null)
			{
				System.out.println("\t"+temp.prev+"->->"+temp.data+"->->"+temp.next);
				temp=temp.next;
				
			}
			System.out.println("\t"+temp.prev+"->->"+temp.data+"->->"+temp.next);
		}
	}
	void insertatbeg(int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.prev=null;
		temp.next=null;
		size++;
		if(size==1)
		{
			Head=temp;
		}
		else
		{
			Node cpy=Head;
			Node last=temp.next=cpy;
			cpy.prev=last;
			Head=temp;
			 
		}
	}
	void insertatpos(int value,int pos)
	{
		Node last1=Head;
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		temp.prev=null;
		size++;
		if(pos>1)
		{
		for(int i=1;i<pos-1;i++)
		{
			last1=last1.next;
		}
		temp.next=last1.next;
		Node last2=last1.next=temp;
		temp.prev=last2;
		}
		else
		{
			Head=temp;
			temp.prev=null;
		}
	}
	void deleteatbeg()
	{
		if(Head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			
			if(size==1)
			{
			Head=null;
			size--;
			}
			else
			{
				Node cpy=Head;
				Node temp=cpy.next;
				temp.prev=null;
				Head=temp;
				size--;

			}
		}
		
	}
	void deleteatend()
	{
		if(Head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			if(size==1)
			{
				Head=null;
				size--;
			}
			else
			{
			Node temp=Head;
			for(int i=1;i<size-1;i++)
			{
				temp=temp.next;
			}			
			temp.next=null;
			size--;
			}
		}
			
	}
	void deleteatpos(int pos)
	{
		if(Head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			if(pos==1 && size>1)
			{
				Node cpy=Head;
				Node temp=cpy.next;
				temp.prev=null;
				Head=temp;
				size--;
			}
			else if(size==1)
			{
				Head=null;
				size--;
			}
			else
			{
			Node cpy=Head;
			Node temp=Head;
			int i=1;
			for(int j=1;j<pos-1;j++)
			{
				temp=temp.next;;
			}
			while(i<pos)
			{
				cpy=cpy.next;
				i++;
			}
			temp.next=cpy.next;
			size--;
			}
		}
		
	}
	void size()
	{
		System.out.println(size);
	}
}

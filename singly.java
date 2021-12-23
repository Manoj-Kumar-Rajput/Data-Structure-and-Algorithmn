package linkedlist;

class singly
{
	private int size;
	private Node Head;
class Node
{
	private int data;
	private Node next;
	
}
	void setData(int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		size++;
		if(Head==null)
		{
			Head=temp;
			
		}
		else
		{
			Node last=Head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=temp;
		}
	}
	void display()
	{
		if(size<=0)
		{
			System.out.println("list is empty");
			
		}
		else
		{
			Node temp=Head;
			while(temp.next!=null)
			{
				System.out.print("\t");
				System.out.println("\t"+temp.data+"->->->"+temp.next);
				temp=temp.next;
			}
			System.out.print("\t");
			System.out.println("\t"+temp.data+"->->->"+temp.next);
		}
	}
	void insertatbeg(int value)
	{
		Node last;
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		size++;
		if(Head==null)
		{
			Head=temp;
			
		}
		else
		{
			last=Head;
			Head=temp;
			Head.next=last;
		}
	}
	void insertatpos(int value,int pos)
	{
		Node last=Head;
		Node last1;
		Node temp=new Node();
		temp.data=value;
		temp.next=null;
		size++;
		if(pos>1)	
		{
			for(int i=1;i<pos-1;i++)
			{
				last=last.next;
			}
			last1=last.next;
			last.next=temp;
			temp.next=last1;
		}
		else
		{Head=temp;
		temp.next=last;
		}
	}
	void sizeoflist()
	{
		System.out.println(size+ " element is placed in linked list");
	}
	void deleteatbeg()
	{
		size--;
		Node temp=Head.next;
		Head=temp;
		
	}
	void deleteatend()
	{
	
		Node temp=Head;
		size--;
		if(size>0)
		{
		for(int i=1;i<size;i++)
		{
			temp=temp.next;
		}
		temp.next=null;
		}
		else
			Head=null;
	}
	void deleteatpos(int pos)
	{
		Node temp=Head;
		Node last1=Head;
		if(pos==1 && size>1)
		{
			Head=temp.next;
		}
		else
		{
			if(pos==size)
			{
				for(int i=1;i<size-1;i++)
				{
					temp=temp.next;
				}
				temp.next=null;
			}
			else
			{
				int i=1;
				while(i<pos)
					{
						temp=temp.next;
						i++;
					}
					temp=temp.next;
				for(int j=1;j<pos-1;j++)
				{
					last1=last1.next;
				}
				last1.next=temp;
			}
		}
		size--;			
	}
}
package doublycircularlinkedlist;

public class dcircular 
{
	
	Node Head;
	int size;
	class Node
	{
		private int data;
		private Node next;
		private Node prev;
	}
	void display()
	{
		Node temp=Head;
		if(temp==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			while(temp.next!=Head)
			{
				System.out.println(temp.prev+"->->"+temp.data+"->->"+temp.next);
				temp=temp.next;
			}
			System.out.println(temp.prev+"->->"+temp.data+"->->"+temp.next);
		}
		
	}
	void create(int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.prev=temp;
		temp.next=temp;
		size++;
		if(Head==null)
		{
			Head=temp;
		}
		else
		{
			Node cpy=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			Node cpy2=cpy.next;
			cpy.next=temp;
			temp.next=Head;
		}
	}
	void createatbeg(int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.prev=temp;
		temp.next=temp;
		size++;
		if(Head==null)
		{
			Head=temp;
		}
		else
		{
			Node cpy2=Head;
			Node cpy=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			temp.next=cpy2;
			cpy.next=temp;
			Head=temp;
		}
	}
	void createatpos(int pos, int value)
	{
		Node temp=new Node();
		temp.data=value;
		temp.prev=temp;
		temp.next=temp;
		size++;
		if(Head==null)
		{
			Head=temp;
		}
		else
		{
			if(pos==1)
			{
				Node cpy=Head;
				temp.next=cpy;
				while(cpy.next!=Head)
				{
					cpy=cpy.next;
				}
				cpy.next=temp;
				Head=temp;
			}
			else
			{
				Node cpy=Head;
				int i=1;
				while(i<pos)
				{
					cpy=cpy.next;
					i++;
				}
				Node cpy2=Head;
				for(int j=1;j<pos-1;j++)
				{
					cpy2=cpy2.next;
				}
				cpy2.next=temp;
				temp.next=cpy;
				
			}
		}
	}
	void deleteatbeg()
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
			}
			else
			{
				Node cpy=Head;
				Node cpy2=Head;
				while(cpy2.next!=Head)
				{
					cpy2=cpy2.next;
				}
				Node temp=cpy.next;
				cpy2.next=temp;
				Head=temp;
			}size--;
		}
	}
	void deleteatend()
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
			}
			else
			{
				Node cpy2=Head;
				Node temp=Head;
				while(temp.next!=Head)
				{
					cpy2=temp;
					temp=temp.next;
				}
				Node cpy=Head;
				cpy2.next=cpy;
			}size--;

		}		
	}
	void deleteatpos(int pos)
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
			}
			else
				if(pos==1)
				{
					Node cpy=Head;
					Node cpy2=Head;
					while(cpy.next!=Head)
					{
						cpy=cpy.next;
					}
					Node temp=cpy2.next;
					cpy.next=temp;
					Head=temp;
				}
				else
				{
					Node cpy=Head;
					int i=1;
					while(i<pos)
					{
						cpy=cpy.next;
						i++;
					}
					Node temp=Head;
					for(int j=1;j<pos-1;j++)
					{
						temp=temp.next;
					}
					Node last=cpy.next;
					temp.next=last;
					Head=temp;
				}
		}size--;
	}
	void sizeoflist()
	{
		System.out.println(size);
	}
}
